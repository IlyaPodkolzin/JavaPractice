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
        return String.format("Память:%n\t* Объём: %d ГБ%n\t* Тактовая частота: %d МГц%n\t* Пропускная способность: %s",
                capacity, clockFrequency, bandwidth);
    }
}
