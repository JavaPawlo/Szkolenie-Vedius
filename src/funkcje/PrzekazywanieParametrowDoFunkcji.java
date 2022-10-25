package funkcje;

public class PrzekazywanieParametrowDoFunkcji
{
    public static void main(String[] args) {
        int x =9;
        System.out.println("Przed wysłaniem wartosc x to: " + x);
        podwojenie(x);
        System.out.println("Po wysłaniu wartosci x to: " + x);
        int[] tab = new int[1];
        tab[0] = 10;
        System.out.println("Przed wysłaniem wartosc w tablicy to: " + tab[0]);
        podwojenie(tab);
        System.out.println("Po wysłaniem wartosc w tablicy to: " + tab[0]);
        Kolo k = new Kolo();
        System.out.println("Przed wysłaniem promien  obiektu k ma wartosc: " + k.getR());
        podwojenie(k);
        System.out.println("Po wysłaniu promien  obiektu k ma wartosc: " + k.getR());


    }

    private static void podwojenie(Kolo k) {
        int temp = k.getR();
        temp = temp*2;
        k.setR(temp);
    }

    private static void podwojenie(int[] tab) {
        for(int i = 0; i < tab.length; i++)
        {
            tab[i] = tab[i] *2;
        }
    }

    private static void podwojenie(int x) { //wnuczek
         x = x*2; //maluje
        System.out.println("Wewnatrz funkcji x to: " + x);
    }
}
class Kolo
{
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
    private int r = 5;
}
