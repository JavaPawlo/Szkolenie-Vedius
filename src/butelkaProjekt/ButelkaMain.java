package butelkaProjekt;

import java.util.ArrayList;
import java.util.Scanner;

public class ButelkaMain
{
    public static void main(String[] args) {
       run();
    }

    private static void run() {
        menu();
        ArrayList<Butelka> listaButelek = new ArrayList<>();
        System.out.println("Podaj wybor: ");
        Scanner scaner = new Scanner(System.in);
        while (scaner.hasNextLine()) {
            String wybor = scaner.nextLine();

            switch (wybor) {
                case "1" -> {
                    System.out.println("Podaj początkowy stan butelki");
                    double stanPoczatkowy = new Scanner(System.in).nextDouble();
                    listaButelek.add(new Butelka(stanPoczatkowy));
                    System.out.println("Utworzono " + listaButelek.get(0));
                }
                case "2" -> {
                    //usun butelke
                }
                case "3" -> {
                    //Dolej do wybranej butelki
                }
                case "4" -> {
                    //Wylej z wybranej butelki
                }
                case "5" -> {
                    //Przelej do butelki
                }
                case "6" -> {
                    //Wypisz stan butelek
                    System.out.println("Do dyspozycji masz: " + listaButelek.size());
                    System.out.println("Wybierz butelke do wypisania");
                    int ktora = new Scanner(System.in).nextInt();
                    if ((ktora > 0) && (ktora <= listaButelek.size()))
                        System.out.println(listaButelek.get(ktora - 1));
                }
                case "koniec" -> {
                    break;
                }
                default -> {
                    System.out.println("Wybierz jeszcze raz");
                }

            }
        }

//        Butelka b1 = new Butelka(8);
//        Butelka b2 = new Butelka(7);
//        Butelka b3 = new Butelka(9);
//        Butelka b4 = new Butelka(-9);
//
//        listaButelek.add(b1);
//        listaButelek.add(b2);
//        listaButelek.add(b3);
//        listaButelek.add(b4);
//        for(Butelka lista: listaButelek)
//        {
//            System.out.println(lista);
//        }
////        b1.dolej(7);
////        System.out.println(b1);
////        b2.dolej(-8);
////        System.out.println("Stan po dolaniu " +b2);
////        b3.wylej(6);
////        System.out.println("Stan po wylaniu " + b3);
//        b1.przelej(20, b2);
//        for(Butelka lista: listaButelek)
//        {
//            System.out.println(lista);
//        }
//        listaButelek.remove(2);
//        System.out.println("Po usunięciu butelki: ");
//        for(Butelka lista: listaButelek)
//        {
//            System.out.println(lista);
//        }
//        Butelka b5 = new Butelka(8);
//        listaButelek.add(b5);
//        System.out.println("po dodaniu nowej butelki ");
//        for(Butelka lista: listaButelek)
//        {
//            System.out.println(lista);
//        }
    }

    private static void dodajButelke(String nazwa, double stanPoczatkowy) {

       // Butelka nazwa = new Butelka(stanPoczatkowy);
    }

    private static void menu() {
        System.out.println("Projetk butelki");
        System.out.println("1 - stwórz butelke");
        System.out.println("2 - usun butelke");
        System.out.println("3 - Dolej do wybranej butelki");
        System.out.println("4 - Wylej z wybranej butelki");
        System.out.println("5 - Przelej do butelki");
        System.out.println("6 - Wypisz stan butelek");
        System.out.println("Zakokoncz program - koniec");
    }
}
