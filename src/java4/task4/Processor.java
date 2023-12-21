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
        return String.format("���������:%n\t* ���������� ����: %d ��.%n\t* ����������: %d ��%n\t* �������� �������: %d",
                coreAmount, techProcess, processorFrequency);
    }
}
