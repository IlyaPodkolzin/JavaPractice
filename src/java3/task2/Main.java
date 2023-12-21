package java3.task2;

public class Main {

    public static void main(String[] args) {
        Tester tester = new Tester();

        tester.generateCircles(10);

        System.out.println("Tester's array: " + tester.toString());
        System.out.println("Max: " + tester.maxCircle().toString());
        System.out.println("Min: " + tester.minCircle().toString());
        System.out.println("==========Sorting...==========");
        tester.sortArray();
        System.out.println("Tester's array: " + tester.toString());
    }
}
