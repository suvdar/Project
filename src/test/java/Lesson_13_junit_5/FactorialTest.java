package Lesson_13_junit_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

class FactorialTest {
    Factorial factorial = new Factorial();
    @Test
    void testFactorialEqualZero() {
        Assertions.assertEquals(BigInteger.valueOf(1), factorial.get(0));
    }

    @Test
    void testFactorialLessZero() {
        Assertions.assertNull(factorial.get(-1));
        Assertions.assertNull(factorial.get(-7));
    }

    @Test
    void testFactorialNaturalInt() {
        Assertions.assertEquals(BigInteger.valueOf(1), factorial.get(1));
        Assertions.assertEquals(BigInteger.valueOf(2), factorial.get(2));
        Assertions.assertEquals(BigInteger.valueOf(120), factorial.get(5));
        Assertions.assertEquals(BigInteger.valueOf(39916800), factorial.get(11));
        Assertions.assertEquals(BigInteger.valueOf(479001600), factorial.get(12));
    }

    @Test
    void testFactorialNaturalLong() {
        Assertions.assertEquals(BigInteger.valueOf(6227020800L), factorial.get(13));
        Assertions.assertEquals(BigInteger.valueOf(87178291200L), factorial.get(14));
        Assertions.assertEquals(BigInteger.valueOf(20922789888000L), factorial.get(16));
        Assertions.assertEquals(BigInteger.valueOf(121645100408832000L), factorial.get(19));
        Assertions.assertEquals(BigInteger.valueOf(2432902008176640000L), factorial.get(20));
    }

    @Test
    void testFactorialNaturalBigInt() {
        Assertions.assertEquals(new BigInteger("51090942171709440000"), factorial.get(21));
        Assertions.assertEquals(new BigInteger("30414093201713378043612608166064768844377641568960512000000000000"), factorial.get(50));
        Assertions.assertEquals(new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"), factorial.get(100));
    }
  
}