package java4.task4;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(8, 32, 3300);
        Memory memory = new Memory(8, 1333, "PC10600");
        Monitor monitor = new Monitor(27, "1920x1080", 60);

        Computer computer = new Computer(ComputerNames.ASUS, processor, memory, monitor);
        System.out.println(computer.toString());
    }
}
