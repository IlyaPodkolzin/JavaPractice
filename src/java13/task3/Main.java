package java13.task3;

public class Main {
    public static void main(String[] args) {

        Address[] addresses = {
                new Address("Россия, Дальневосточный федеральный округ, Хабаровск, Дикопольцева, 10, 1, 122"),
                Address.getAddress("Россия; Дальневосточный федеральный округ; Хабаровск; Ростовский; 5; 1; 104"),
                Address.getAddress("Россия, Северо-Западный федеральный округ, Калининград, Майский, 5, 1, 199"),
                Address.getAddress("Россия. Северо-Западный федеральный округ. Калининград. Сержанта Колосскова. 8. 5. 34")
        };

        for (Address address : addresses) System.out.println(address);
    }
}
