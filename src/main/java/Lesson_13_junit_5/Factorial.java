package Lesson_13_junit_5;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger get(int n) {
        BigInteger result = n >= 0 ? BigInteger.ONE : null;
        for (int i = 1; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
