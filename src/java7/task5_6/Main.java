package java7.task5_6;

public class Main {
    public static void main(String[] args) {

        // ������������ �������
        ProcessStrings processStrings = new ProcessStrings("qwertyuiop");

        System.out.println(processStrings.size());
        System.out.println(processStrings.onOddPositions());
        System.out.println(processStrings.reverse());

    }
}
