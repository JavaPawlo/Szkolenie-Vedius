package klasaBigInteger;

import java.math.BigInteger;

public class KlasaBigInteger
{
    public static void main(String[] args) {
        int i = 1000000000;
        long l = 1000000000000000000L;
        System.out.println(l*l);

        BigInteger bi1 = new BigInteger("10000000000000000000000000000");
        BigInteger bi2 = new BigInteger("10000000000000000000000000000");

        //System.out.println(bi1*bi2); tak nie
        System.out.println("Duża liczba " + bi1.multiply(bi2));
        System.out.println("Duża liczba " + bi1.add(bi2));

        System.out.println("duza pomnozona przez i + " +
                bi1.multiply(BigInteger.valueOf(i)));
    }
}
