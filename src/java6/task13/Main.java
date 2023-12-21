package java6.task13;

public class Main {
    public static void main(String[] args) {

        // тестирование методов
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        new Printer(myStringBuilder);
        new GoodPrinter(myStringBuilder);

        myStringBuilder.append("asdsadas");
        myStringBuilder.delete(2, 5);
        myStringBuilder.append("ggg");

    }
}
