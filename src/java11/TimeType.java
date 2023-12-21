package java11;

import java.util.Date;

// форматы даты
public enum TimeType {
    YEAR,
    DATE,
    FULL;

    // дату в строку по формату
    public static String dateToString(Date date, TimeType timeType) {

        switch (timeType) {

            case YEAR -> {
                return String.valueOf(date.getYear() + 1900);
            }
            case DATE -> {
                return date.getDate() + "." + date.getMonth();
            }
            case FULL -> {
                return dateToString(date, DATE) + "." + dateToString(date, YEAR);
            }
            default -> {
                return null;
            }
        }
    }
}
