package java7.task5_6;

public class Main {
    public static void main(String[] args) {

        // тестирование методов
        ProcessStrings processStrings = new ProcessStrings("qwertyuiop");

        System.out.println(processStrings.size());
        System.out.println(processStrings.onOddPositions());
        System.out.println(processStrings.reverse());

    }
}
