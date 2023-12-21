package java6.task10;

import java.util.Scanner;

// память
public class Memory implements Product {

    private int storageCapacity;
    private int maximumReadingSpeed;
    private int maximumWriteSpeed;

    // конструктор
    Memory(int storageCapacity, int maximumReadingSpeed, int maximumWriteSpeed) {
        this.storageCapacity = storageCapacity;
        this.maximumReadingSpeed = maximumReadingSpeed;
        this.maximumWriteSpeed = maximumWriteSpeed;
    }

    public Memory(Scanner scanner) {
        enterPerformance(scanner);
    }

    // в строку
    @Override
    public String toString() {
        return "Memory{" +
                "storageCapacity=" + storageCapacity +
                ", maximumReadingSpeed=" + maximumReadingSpeed +
                ", maximumWriteSpeed=" + maximumWriteSpeed +
                '}';
    }

    @Override
    public void enterPerformance(Scanner scanner) {
        System.out.println("Enter memory data:");
        System.out.print("storageCapacity=");
        storageCapacity = scanner.nextInt();
        System.out.print("maximumReadingSpeed=");
        maximumReadingSpeed = scanner.nextInt();
        System.out.print("maximumWriteSpeed=");
        maximumWriteSpeed = scanner.nextInt();
    }

    public boolean compareTo(Memory o) {
            return o.storageCapacity <= storageCapacity & o.maximumWriteSpeed <= maximumWriteSpeed & o.maximumReadingSpeed <= maximumReadingSpeed;
    }
}
