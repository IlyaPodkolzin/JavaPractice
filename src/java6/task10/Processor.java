package java6.task10;

import java.util.Scanner;

// процессоры
public class Processor implements Product {
    private int numberOfCores;
    private int maximumNumberOfThreads;
    private double baseCPUFrequency;

    // конструктор
    Processor(int numberOfCores, int maximumNumberOfThreads, double baseCPUFrequency) {
        this.numberOfCores = numberOfCores;
        this.maximumNumberOfThreads = maximumNumberOfThreads;
        this.baseCPUFrequency = baseCPUFrequency;
    }

    public Processor(Scanner scanner) {
        enterPerformance(scanner);
    }

    // в строку
    @Override
    public String toString() {
        return "Processor{" +
                "numberOfCores=" + numberOfCores +
                ", maximumNumberOfThreads=" + maximumNumberOfThreads +
                ", baseCPUFrequency=" + baseCPUFrequency +
                '}';
    }

    @Override
    public void enterPerformance(Scanner scanner) {
        System.out.println("Enter processor data:");
        System.out.print("numberOfCores=");
        numberOfCores = scanner.nextInt();
        System.out.print("maximumNumberOfThreads=");
        maximumNumberOfThreads = scanner.nextInt();
        System.out.print("baseCPUFrequency=");
        baseCPUFrequency = scanner.nextInt();
    }

    public boolean compareTo(Processor o) {
        return o.numberOfCores <= numberOfCores & o.maximumNumberOfThreads <= maximumNumberOfThreads & o.baseCPUFrequency <= baseCPUFrequency;
    }
}
