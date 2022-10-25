package szkoleniePodstawowe;

import java.util.Scanner;

public class KalkulatorWalut3 {
    public static void main(String[] args)
    {
        //kursy walut
        Double usdPln = 4.9;
        Double nokPln = 0.47;
        Double eurPln = 5.1;
        Double gbpPln = 5.6;


        while (true) {
//wybór waluty
            while (true) {
                System.out.println("szkoleniePodstawowe.Kalkulator wymiany złotówki PLN na inną walutę:");
                System.out.println();
                System.out.println("Waluta Dolar - USD;");
                System.out.println("Waluta Korona Norweska - NOK;");
                System.out.println("Waluta Euro - EUR;");
                System.out.println("Waluta Funt Szterling - GBP;");
                System.out.println("Jeśli chcesz wyjść z kalkulatora napisz - koniec;");
                System.out.println();
                System.out.println("Na jaką walutę chcesz wymienić? (Wpisz symbol z listy powyżej.)");
                String waluta = new Scanner(System.in).nextLine();


                //Wyjście z programu
                if (waluta.equals("koniec")) {
                    break;}
                System.out.println("Podaj Kwotę w PLN:");
                //Jaką kwote ma przeliczyć
                double kwota = new Scanner(System.in).nextDouble();

                if (kwota <= 0) {
                    System.out.println("Kwota powinna być większa od zera.");// Kwota powinna być wieksz od zera
                }
                else
                {
//Wyświetlenie wyniku
                    switch (waluta)
                    {
                        case "USD" -> System.out.println("Za " + kwota + " PLN dostaniesz " + kwota / usdPln + " "+waluta);
                        case "NOK" -> System.out.println("Za " + kwota + " PLN dostaniesz " + kwota / nokPln + " "+waluta);
                        case "EUR" -> System.out.println("Za " + kwota + " PLN dostaniesz " + kwota / eurPln + " "+waluta);
                        case "GBP" -> System.out.println("Za " + kwota + " PLN dostaniesz " + kwota / gbpPln + " "+waluta);
                    }
                }
            }
        }
    }
}
