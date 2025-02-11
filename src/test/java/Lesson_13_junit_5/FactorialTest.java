package Lesson_13_junit_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

class FactorialTest {
    @Test
    void zero() {
        Assertions.assertEquals(BigInteger.valueOf(1), Factorial.get(0));
    }

    @Test
    void lessZero() {
        Assertions.assertNull(Factorial.get(-1));
        Assertions.assertNull(Factorial.get(-7));
    }

    @Test
    void naturalInt() {
        Assertions.assertEquals(BigInteger.valueOf(1), Factorial.get(1));
        Assertions.assertEquals(BigInteger.valueOf(2), Factorial.get(2));
        Assertions.assertEquals(BigInteger.valueOf(120), Factorial.get(5));
        Assertions.assertEquals(BigInteger.valueOf(39916800), Factorial.get(11));
        Assertions.assertEquals(BigInteger.valueOf(479001600), Factorial.get(12)); // Граничное значение факториала которое помещается в int
    }

    @Test
    void naturalLong() {
        Assertions.assertEquals(BigInteger.valueOf(6227020800L), Factorial.get(13));
        Assertions.assertEquals(BigInteger.valueOf(87178291200L), Factorial.get(14));
        Assertions.assertEquals(BigInteger.valueOf(20922789888000L), Factorial.get(16));
        Assertions.assertEquals(BigInteger.valueOf(121645100408832000L), Factorial.get(19));
        Assertions.assertEquals(BigInteger.valueOf(2432902008176640000L), Factorial.get(20)); // Граничное значение факториала которое помещается в long
    }

    @Test
    void naturalBigInt() {
        Assertions.assertEquals(new BigInteger("51090942171709440000"), Factorial.get(21));
        Assertions.assertEquals(new BigInteger("30414093201713378043612608166064768844377641568960512000000000000"), Factorial.get(50));
        Assertions.assertEquals(new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"), Factorial.get(100));
    }
}