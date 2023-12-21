package java4.task4;

public class Computer {
    private final ComputerNames computerNames;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;

    public Computer(ComputerNames computerNames, Processor processor, Memory memory, Monitor monitor) {
        this.computerNames = computerNames;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return String.format("��������� %s � ��� ��������������:%n=== ���������: %s%n=== ������: %s%n=== �������: %s%n",
                computerNames, processor.toString(), memory.toString(), monitor.toString());
    }
}
