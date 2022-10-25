package rekurencja;

import java.math.BigInteger;

public class SilniaZMierzeniemCzasu
{
    public static void main(String[] args) {
        //long start = System.currentTimeMillis();
        long start = System.nanoTime();
        System.out.println("silnia iteracyjnie " + silniaIteracyjnie(20));
        //System.out.println("Czas iteracyjnie " +
                //(System.currentTimeMillis() - start));
        System.out.println("Czas iteracyjnie " +
        (System.nanoTime() - start));
        start = System.nanoTime();
        System.out.println("Silania rekurencyjnie " + silniaRekurencyjnie(20));
        System.out.println("Czas rekurencyjnie " +
                (System.nanoTime() - start));
    }
public static long silniaIteracyjnie(long n)
{
    long silnia = 1;
    for (int i = 2; i <= n; i++) {
        silnia=silnia*i;
    }
    return silnia;
}
public static long silniaRekurencyjnie(long n)
{
    if(n>1) return n*silniaIteracyjnie(n-1);
    else return 1;
}
    public static BigInteger silniaIteracyjnieB(long n)
    {
        BigInteger silnia = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            silnia = silnia.multiply(BigInteger.valueOf(i));
        }
        return silnia;
    }
    public static BigInteger silniaRekurencyjnieB(long n)
    {
        if(n > 1) return BigInteger.valueOf(n).multiply(silniaRekurencyjnieB(-1));
        else return BigInteger.valueOf(1);
    }


}

