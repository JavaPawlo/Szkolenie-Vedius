package szkoleniePodstawowe;

public class Rzutowanie
{
    public static void main(String[] args) {
        int a = 5, b = 2;
        double c = 12.0, d = 15.0;
        int wynik =0;
        double wynik2 =0;

        System.out.println("Wynik dzielenia całkowitego: "+ (a/b)) ;
        //operator dzielenia całkowitego
        System.out.println("Dzielenie zmiennych wyższego rzędu " + (2.0/5));

        wynik2 = a/b; //2.0

        System.out.println( "Wynik dzielenia calkowitego wpisanego do zmiennej typu double: " + wynik2 );

        wynik2 = (double)a/b;
        System.out.println("Wynik dzielenia przy rzutowaniu: " + wynik2);
        //wynik = (double)a/b;
        //System.out.println("Błąd kompilacji " <<wynik);

        //wynik = (c/d);     //converting to 'int' from 'double'
        //cast - rzutowanie
        // System.out.println("Błąd kompilacji = "+wynik);
        wynik2 = c/d;
        System.out.println( "Dzielenie liczb typu double " + wynik2) ;
        wynik2 = (int)c / d;
        System.out.println( "Dzielenie z rzutowaniem na liczbe typu int " + wynik2) ;
        // wynik = (int)c / d;
        //System.out.println( "Dzielenie z rzutowaniem na liczbe typu int do zmiennej typu int - Błąd kompilacji " + wynik) ;

    }
}
