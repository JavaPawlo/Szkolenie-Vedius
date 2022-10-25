package szkoleniePodstawowe;

import java.util.Scanner;

public class KalkulatorWalut2 {
    public static void main(String[] args) {


        //Prosty szkoleniePodstawowe.Kalkulator walut
        //sprawdz czy uzytkownik podal dodatnia liczbe


        // START PROGRAMU ->
        while (true) {


            //Euro Wartość kupna i sprzedazy -> Wartości do wprowadzenia recznie
            double kupnoE = 6.0;
            double sprzedazE = 5.0;

            //Dolar Wartość kupna i sprzedazy -> Wartości do wprowadzenia recznie
            double kupno$ = 5.3;
            double sprzedaz$ = 4.9;


            System.out.println("Prosty kalkulator Walut kupno/sprzedaz, \nWybierz Walute");
            System.out.println(" 1 = Dolar,\n 2 = Euro");

            //2x switch
            //1. switch głowny (waluta) -> Wybor waluty
            //2. switch zagnieżdżony (wybor) -> Wybor akcji kupna i sprzedazy wybranej waluty

            String waluta = new Scanner(System.in).nextLine();

            switch (waluta){


                case "1" -> {
                    System.out.println("Wybierz + Kupic $");
                    System.out.println("Wybierz - Sprzedac $");

                    String wybor = new Scanner(System.in).nextLine();

                    switch (wybor) {


                        case "+" -> {

                            System.out.println("Ile chcesz kupic?");
                            double a = new Scanner(System.in).nextInt();
                            System.out.println("Kupno:" + (Math.round(a * kupno$)));



                        }
                        case "-" -> {

                            System.out.println("Ile chcesz Sprzedac?");
                            double a = new Scanner(System.in).nextInt();
                            System.out.println("Sprzedaz:" + (a / sprzedaz$));


                        }
                        default -> System.out.println("bledny wybor");
                    }
                }


                case "2" -> {

                    System.out.println("Wybierz + Kupic $");
                    System.out.println("Wybierz - Sprzedac $");

                    String wybor = new Scanner(System.in).nextLine();

                    switch (wybor) {


                        case "+" -> {

                            System.out.println("Ile chcesz kupic?");
                            double a = new Scanner(System.in).nextInt();
                            System.out.println("Kupno:" + (Math.round(a * kupnoE)));



                        }
                        case "-" -> {

                            System.out.println("Ile chcesz Sprzedac?");
                            double a = new Scanner(System.in).nextInt();
                            System.out.println("Sprzedaz:" + (a / sprzedazE));


                        } default -> System.out.println("bledny wybor");
                    }

                }

            }

        }
        // KONIEC PROGRAMU
    }}
