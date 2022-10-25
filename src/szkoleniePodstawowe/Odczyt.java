package szkoleniePodstawowe;

import java.util.Scanner;

public class Odczyt
{
    public static void main(String[] args)
    {
        //int a;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = odczyt.nextInt();
        System.out.println("Podana przez ciebie liczba to:" + liczba);
        //System.out.println("Podaj imię"); nie działą dla Stringa
       // String imie = odczyt.nextLine(); dziala dla int
       // System.out.println("Podane imię to: " + imie);
      Scanner im  =  new Scanner(System.in);
        System.out.println("Podaj imię");
        String imie = im.nextLine();
        System.out.println("Podane imię to: " + imie);
        System.out.println("Podaj średnią:");
        double srednia = new Scanner(System.in).nextDouble();
        System.out.println("Podana średnia to: "+ srednia);
        System.out.println("Podaj liczbę rzeczywistą z kropką");
        String doDouble = new Scanner(System.in).nextLine();
        System.out.println("Odczytany string to:" + doDouble);
        double rzeczywista = Double.parseDouble(doDouble);
        System.out.println("Zmieniona liczba to: "+ rzeczywista*rzeczywista);
    }
}
