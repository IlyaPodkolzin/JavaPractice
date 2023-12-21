package java4.task4;

public class Processor {
    private final int coreAmount;
    private final int techProcess;
    private final int processorFrequency;

    public Processor(int coreAmount, int techProcess, int processorFrequency) {
        this.coreAmount = coreAmount;
        this.techProcess = techProcess;
        this.processorFrequency = processorFrequency;
    }

    @Override
    public String toString() {
        return String.format("Процессор:%n\t* Количество ядер: %d шт.%n\t* Техпроцесс: %d нм%n\t* Такстова частота: %d",
                coreAmount, techProcess, processorFrequency);
    }
}
