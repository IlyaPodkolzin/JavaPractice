package java4_1.task2;

public class Phone {
    private final String number;
    private final String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        weight = 0.0;
    }

    public Phone() {
        number = "---";
        model = "---";
        weight = 0.0;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.printf("Звонит %s%n", name);
    }

    public void receiveCall(String name, String number) {
        System.out.printf("%s - звонит %s%n", number, name);
    }

    public void sendMessage(String ... numbers) {
        System.out.println("Сообщение отправлено на следующие номера:");
        for (String number: numbers) System.out.println(number);
    }
}
