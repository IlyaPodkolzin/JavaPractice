package java4.company;

public class Main {

    public static void main(String[] args) {
        TimesOfYear favouriteTime = TimesOfYear.WINTER;
        System.out.printf("%s - �� ������� ����� ����. ��� ����� �������� ����� ���� � �������� � ���� �����.%n",
                favouriteTime);

        System.out.println("================");

        for (TimesOfYear timesOfYear: TimesOfYear.values()) {
            isSummer(timesOfYear);
        }

        System.out.println("================");

        for (TimesOfYear timesOfYear: TimesOfYear.values()) {
            System.out.printf("%s:%n---�����������: %s%n%s%n%n%n",
                    timesOfYear,
                    timesOfYear.avg,
                    timesOfYear.getDescription());
        }
    }

    public static void isSummer(TimesOfYear timesOfYear) {
        switch (timesOfYear) {
            case SPRING:
                System.out.println("� ����� �����!");
                break;
            case SUMMER:
                System.out.println("� ����� ����!");
                break;
            case AUTUMN:
                System.out.println("� ����� �����!");
                break;
            case WINTER:
                System.out.println("� ����� ����!");
                break;
        }
    }
}
