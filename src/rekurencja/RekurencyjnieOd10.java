package rekurencja;

public class RekurencyjnieOd10
{
    public static void main(String[] args) throws Exception {
        funkcjaRekurencyjna(10);
    }

    private static void funkcjaRekurencyjna(int i) throws Exception {
        if( i <= 0) return;
        System.out.println("Odliczam "+ i);
        Thread.sleep(1000);
        funkcjaRekurencyjna(i-1);
    }
}
