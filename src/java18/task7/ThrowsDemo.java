package java18.task7;

import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (Objects.equals(key, "0")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {

        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.getKey();
    }
}
