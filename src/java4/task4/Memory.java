package java4.task4;

public class Memory {
    private final int capacity;
    private final int clockFrequency;
    private final String bandwidth;

    public Memory(int capacity, int clockFrequency, String bandwidth) {
        this.capacity = capacity;
        this.clockFrequency = clockFrequency;
        this.bandwidth = bandwidth;
    }

    @Override
    public String toString() {
        return String.format("������:%n\t* �����: %d ��%n\t* �������� �������: %d ���%n\t* ���������� �����������: %s",
                capacity, clockFrequency, bandwidth);
    }
}
