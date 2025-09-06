import java.math.BigInteger;

public class Multiply {
    public static String bigIntMultiply(String aStr, String bStr) {
        BigInteger a = new BigInteger(aStr);
        BigInteger b = new BigInteger(bStr);
        return a.multiply(b).toString();
    }
    public static int secondMultiply(int a, int b) {
        if (a == 0 || b == 0) return 0;
        boolean negative = (a < 0) ^ (b < 0);
        int x = a < 0 ? -a : a;
        int y = b < 0 ? -b : b;
        int result = 0;
        for (int i = 0; i < y; i++) {
            result += x;
        }
        return negative ? -result : result;
    }
    public static long simpleMultiply(long a, long b) {
        if (b == 0) return 0;
        if (b < 0) return -simpleMultiply(a, -b);
        return a + simpleMultiply(a, b - 1);
    }
    public static long fastMultiply(long a, long b) {
        boolean isNegative = (a < 0) ^ (b < 0);
        a = Math.abs(a);
        b = Math.abs(b);
        long result = 0;

        while (b > 0) {
            if ((b & 1) == 1) result += a;
            a <<= 1;
            b >>= 1;
        }
        if (isNegative) {
            return -result;
        } else {
            return result;
        }
    }
}
