package java4.company;

public enum TimesOfYear {
    SPRING(14.53),
    SUMMER(26.9),
    AUTUMN(10),
    WINTER(-13.13);

    public final double avg;

    private TimesOfYear(double avg) {
        this.avg = avg;
    }

    public String getDescription() {
        switch (this) {
            case SUMMER:
                return "Тёплое время года.";
            default:
                return "Холодное время года.";
        }
    }
}
