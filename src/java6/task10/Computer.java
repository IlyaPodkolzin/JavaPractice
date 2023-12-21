package java6.task10;

import java.util.Scanner;

// компьютер
public class Computer implements Product {

    // части компьютера
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private VideoCard videoCard;

    Computer(ComputerBrand brand, Processor processor, Memory memory, VideoCard videoCard) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.videoCard = videoCard;
    }

    // конструктор дл€ ввода данных с консоли
    public Computer(Scanner scanner) {
        enterPerformance(scanner);
    }

    @Override
    public String toString() {
        return "Computer " + brand + ":\n" +
                "processor = " + processor + '\n' +
                "memory = " + memory + '\n' +
                "videoCard = " + videoCard
                ;
    }

    // ввод данных с консоли
    @Override
    public void enterPerformance(Scanner scanner) {

        System.out.println("¬ведите информацию о компьютере:");

        System.out.println("¬ведите номер производител€:");
        for (int i = 0; i < ComputerBrand.values().length; i++) System.out.println(i + " - " + ComputerBrand.values()[i].name());
        brand = ComputerBrand.values()[scanner.nextInt()];
        System.out.println();

        processor = new Processor(scanner);
        System.out.println();
        memory = new Memory(scanner);
        System.out.println();
        videoCard = new VideoCard(scanner);
        System.out.println();
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }
}
