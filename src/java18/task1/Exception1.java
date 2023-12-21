package java18.task1;

public class Exception1 {


    public void exceptionDemo1() {
        System.out.println(2 / 0);
    }

    public void exceptionDemo2() {
        System.out.println(2.0 / 0.0);
    }

    public void exceptionDemo3() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0!");
        }
    }

    public static void main(String[] args) {

        Exception1 exception1 = new Exception1();
//        exception1.exceptionDemo1();     //Exception in thread "main" java.lang.ArithmeticException: / by zero

        exception1.exceptionDemo2();
        System.out.println();
        exception1.exceptionDemo3();
    }
}

