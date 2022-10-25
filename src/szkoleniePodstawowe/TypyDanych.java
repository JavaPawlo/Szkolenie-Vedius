package szkoleniePodstawowe;

public class TypyDanych
{
    public static void main(String[] args)
    {
       /* System.out.println("Typy danych");
        char mojaNowaZmienna; //camel case
        char zmianna; //c++ */
        //char variable;
        char zmienna = 'a';
        System.out.println("Moj znak to: " + zmienna);
        String napis = "Kiedy przerwa";
        System.out.println("Jakie jest pytanie? " + napis);
        boolean logiczna = false;
        System.out.println("Jaka jest logiczna wartosc "+logiczna    );
        byte malaLiczba = 127;
        System.out.println("Moja mala liczba przechowyje " + malaLiczba);
        byte mala1 = Byte.MIN_VALUE;
        byte mala2 = Byte.MAX_VALUE;
        System.out.println("Typ byte calkowity min " + mala1);
        System.out.println("Typ byte calkowity max " + mala2);
        short srednia = 32000;
        System.out.println("Typ short calkowity min " + Short.MIN_VALUE);
        System.out.println("Typ short calkowity max " + Short.MAX_VALUE);
        int duza = 452234234;
        System.out.println("Typ int calkowity min " + Integer.MIN_VALUE);
        System.out.println("Typ int calkowity max " + Integer.MAX_VALUE);
        long bardzoDuza = 234354657463453453l;
        System.out.println("Typ long calkowity min " + Long.MIN_VALUE);
        System.out.println("Typ long calkowity max " + Long.MAX_VALUE);
        float zmiennoprzecinkowa = 1.09876f;
        System.out.println("Typ float zmiennoprzecinkowy min " + Float.MIN_VALUE);
        System.out.println("Typ float zmiennoprzecinkowy max " + Float.MAX_VALUE);
        double zmiennoprzecinkowaDuza = 23434.98877;
        System.out.printf("Liczba" + zmiennoprzecinkowaDuza);
        System.out.println("Typ double zmiennoprzecinkowy min " + Double.MIN_VALUE);
        System.out.println("Typ double zmiennoprzecinkowy max " + Double.MAX_VALUE);
    }
}
