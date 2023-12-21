package java1;

import java.math.BigInteger;

public class Part5 {

    public static void main(String[] args) {
        for (int j = 200000; j < 200001; j++) {
            System.out.println(j + "! = " + factorial(j));
        }
    }

    private static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= number; i++)
            result = result.multiply(BigInteger.valueOf(i));

        return result;
    }
}
