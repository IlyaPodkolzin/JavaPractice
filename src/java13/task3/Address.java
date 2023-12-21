package java13.task3;

import java.util.StringTokenizer;

public class Address {
    public String country;
    public String region;
    public String city;
    public String street;
    public String house;
    public String houseBody;
    public String apartment;

    Address (String stringAddress) {
        String[] parts = stringAddress.split(",");

        country = parts[0];
        region = parts[1].substring(1);
        city = parts[2].substring(1);
        street = parts[3].substring(1);
        house = parts[4].substring(1);
        houseBody = parts[5].substring(1);
        apartment = parts[6].substring(1);
    }

    public Address() {
    }

    public static Address getAddress(String stringAddress) {
        Address address = new Address();

        StringTokenizer st = new StringTokenizer(stringAddress, ";,.");

        String token = st.nextToken();
        address.country = token;
        token = st.nextToken();
        address.region = token.substring(1);
        token = st.nextToken();
        address.city = token.substring(1);
        token = st.nextToken();
        address.street = token.substring(1);
        token = st.nextToken();
        address.house = token.substring(1);
        token = st.nextToken();
        address.houseBody = token.substring(1);
        token = st.nextToken();
        address.apartment = token.substring(1);

        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", houseBody='" + houseBody + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
