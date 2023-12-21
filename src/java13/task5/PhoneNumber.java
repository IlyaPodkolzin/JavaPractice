package java13.task5;

public class PhoneNumber {
    public String countryCode;
    public String number;

    public PhoneNumber(String string) {
        number = string.substring(string.length() - 10, string.length() - 7) + "-" +
                string.substring(string.length() - 7, string.length() - 4) + "-" +
                string.substring(string.length() - 4);
        countryCode = string.substring(0, string.length() - 10);
        if (countryCode.equals("8")) countryCode = countryCode.replaceAll("8", "+7");
    }

    @Override
    public String toString() {
        return countryCode + " " + number;
    }
}
