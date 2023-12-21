package java20.task4;

public class Calculator {
    public static <T extends Number, N extends Number> double sum(T x, N y) {
        return x.doubleValue() + y.doubleValue();
    }

    public static <T extends Number, N extends Number> double sub(T x, N y) {
        return x.doubleValue() - y.doubleValue();
    }

    public static <T extends Number, N extends Number> double mul(T x, N y) {
        return x.doubleValue() * y.doubleValue();
    }

    public static <T extends Number, N extends Number> double div(T x, N y) {
        return x.doubleValue() / y.doubleValue();
    }
}
