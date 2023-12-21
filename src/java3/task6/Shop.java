package java3.task6;

import java.util.Random;

public class Shop {
    static double price;
    static String currency = "us";

    private static void definePrice() {
        Random random = new Random();
        price = random.nextDouble() * random.nextInt(150);
    }

    public static double getPrice() {
        return price;
    }

    public static double getChange() {
        return -1 * price;
    }

    public static void setCurrency(String currency) {
        Shop.currency = currency;
    }

    public static String getCurrency() {
        return currency;
    }

    public static double getConvertedRequestedMoney(double entities) {
        if (currency.equals("eu")) entities = Converter.EuroToDollar(entities);
        return entities;
    }

    public static boolean requestMoney(double entities) {
        if (currency.equals("us")) {
            if (entities < price) return false;
            else price -= entities;
        }

        else {
            if (Converter.EuroToDollar(entities) < price) return false;
            else price -= Converter.EuroToDollar(entities);
        }

        return true;
    }

    public static void startWorking() {
        definePrice();
    }
}
