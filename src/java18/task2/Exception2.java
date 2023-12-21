package java18.task2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo1() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }

    public void exceptionDemo2() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Only integer!!!");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero!!!");
        }

    }

    public static void main(String[] args) {

        Exception2 exception2 = new Exception2();

//        Exception in thread "main" java.lang.NumberFormatException: For input string: "Qwerty"
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        Exception in thread "main" java.lang.NumberFormatException: For input string: "1.2"
//        1 - 2
//        exception2.exceptionDemo1();

        exception2.exceptionDemo2();
    }
}
