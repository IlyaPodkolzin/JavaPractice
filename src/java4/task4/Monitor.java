package java4.task4;

public class Monitor {
    private final double diagonal;
    private final String maxResolution;
    private final int updateFrequency;

    public Monitor(double diagonal, String maxResolution, int updateFrequency) {
        this.diagonal = diagonal;
        this.maxResolution = maxResolution;
        this.updateFrequency = updateFrequency;
    }

    @Override
    public String toString() {
        return String.format("�������:%n\t* ���������: %.1f\"%n\t* ������������ ����������: %s%n\t* ������������ ������� ���������� ������: %d ��",
                diagonal, maxResolution, updateFrequency);
    }
}
