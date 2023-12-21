package java4.company;

public class Main {

    public static void main(String[] args) {
        TimesOfYear favouriteTime = TimesOfYear.WINTER;
        System.out.printf("%s - моЄ любимое врем€ года. Ёто самое холодное врем€ года с осадками в виде снега.%n",
                favouriteTime);

        System.out.println("================");

        for (TimesOfYear timesOfYear: TimesOfYear.values()) {
            isSummer(timesOfYear);
        }

        System.out.println("================");

        for (TimesOfYear timesOfYear: TimesOfYear.values()) {
            System.out.printf("%s:%n---“емпература: %s%n%s%n%n%n",
                    timesOfYear,
                    timesOfYear.avg,
                    timesOfYear.getDescription());
        }
    }

    public static void isSummer(TimesOfYear timesOfYear) {
        switch (timesOfYear) {
            case SPRING:
                System.out.println("я люблю весну!");
                break;
            case SUMMER:
                System.out.println("я люблю лето!");
                break;
            case AUTUMN:
                System.out.println("я люблю осень!");
                break;
            case WINTER:
                System.out.println("я люблю зиму!");
                break;
        }
    }
}
