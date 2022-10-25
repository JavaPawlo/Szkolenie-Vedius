package szkoleniePodstawowe;

import java.util.Scanner;

public class KalkulatorTrzechWalut

        //Jest to program przeliczający grupy walut z polskiej na zagraniczne oraz z zagranicznych na polskie.
{
    public static void main(String[] args)
    {
        System.out.println("KALKULATOR WALUT");
        System.out.println("Podaj, jaką grupę walut chcesz przeliczyć:");
        System.out.println("Do wyboru masz: eur/pln, usd/pln, gbp/pln lub pln/eur, pln/usd, pln/gbp:");

        //3 powyższe linijki wyświetlają użytkownikowi, jak nazywa się program oraz instrukcje
        //aby przeliczyć wality.

        double eur = 4.90; //wprowadzenie obecnego kursu eur
        double usd = 5.00; //wprowadzenie obecnego kursu usd
        double gbp = 5.50; //wprowadzenie obecnego kursu gbp

        while (true) //pętla nieskończona
        {
            String wybór = new Scanner(System.in).nextLine();

            //Linijka powyżej: Odczytanie, jaką grupę walut użytkownik chce przeliczyć.

            if (wybór.equals("koniec"))
            {
                break;
            }

            //4 linijki powyżej: Jeśli użytkownik napisze słowo "koniec", program się zakończy.

            System.out.println("Podaj kwotę, jaką chcesz przeliczyć:"); //Instrukcja dla użytgkownika, aby podał kwotę
            double kwota = new Scanner(System.in).nextDouble(); //Odczytanie, jaką kwotę podał użytkownik

            if (kwota >= 0) //Jeśli kwota jest większa lub równa 0, wtedy program przelicza waluty i podaje wyniki.
            {
                switch (wybór) //Wybór grup walut przez użytkownika.
                {
                    case "eur/pln" -> //Przypadek 1 - grupa walut eur/pln
                    {
                        System.out.println(kwota + "EUR =" + kwota * eur + "PLN");
                        //Powyższa linijka wyświetla podaną przez użytkownika kwotę w pierwszej walucie
                        //z grupy, oblicza przeliczoną wartość na drugą kwotę z grupy i wyświetla wynik.
                        System.out.println("Podaj ponownie grupę walut jaką chcesz przeliczyć: ");
                        //Program prosi użytkownika o ponowny wybór waluty.
                    }
                    case "usd/pln" ->
                    {
                        System.out.println(kwota + "USD =" + kwota * usd + "PLN");
                        System.out.println("Podaj ponownie grupę walut jaką chcesz przeliczyć: ");
                    }
                    case "gbp/pln" ->
                    {
                        System.out.println(kwota + "GBP =" + kwota * gbp + "PLN");
                        System.out.println("Podaj ponownie grupę walut jaką chcesz przeliczyć: ");
                    }
                    case "pln/eur" ->
                    {
                        System.out.println(kwota + "PLN =" + kwota / eur + "EUR");
                        System.out.println("Podaj ponownie grupę walut jaką chcesz przeliczyć: ");
                    }
                    case "pln/usd" ->
                    {
                        System.out.println(kwota + "PLN =" + kwota / usd + "USD");
                        System.out.println("Podaj ponownie grupę walut jaką chcesz przeliczyć: ");
                    }
                    case "pln/gbp" ->
                    {
                        System.out.println(kwota + "PLN =" + kwota / gbp + "GBP");
                        System.out.println("Podaj ponownie grupę walut jaką chcesz przeliczyć: ");
                    }
                }
            }
            else //Jeśli kwota jest mniejsza od 0, wtedy program podaje komunikat, aby podać wartość
            // większą lub równą 0.
            {
                System.out.println("Podaj wartość większą lub równą 0");
            }
        }
    }
}
