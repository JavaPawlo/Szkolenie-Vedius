package funkcje;

import java.util.Scanner;

public class PolaFigur {
    public static void main(String[] args) {
        System.out.println("program do obliczen pol");
        System.out.println("1 - pole kwadratu");
        System.out.println("2 - pole prostokata");
        System.out.println("3 - pole kola");
        System.out.println("4 - pole trojkata");
        System.out.println("koniec to koniec");
        System.out.println("podaj ilosc gwiazdek");
        int iloscGwiazdek = new Scanner(System.in).nextInt();
        int wybor = 2;
        switch (wybor)
        {
            case 1: {
                gwiazdki();

                polekw(6);
                gwiazdki(iloscGwiazdek);
                break;
            }
            case 2: {
                gwiazdki();
                poleprost(5,7);
                gwiazdki(iloscGwiazdek);
                break;
            }

            case 3: {
                gwiazdki();
                polekola(-9);
                gwiazdki(iloscGwiazdek);
                break;
           }
            case 4: {
                gwiazdki();
                poletr(3,7);
                gwiazdki(iloscGwiazdek);
                break;
            }
            default: System.out.println("Inna opcja");
        }
    }
    public static void gwiazdki()
    {
        for(int i = 0; i<50; i++)
            System.out.print("*");

        System.out.println();
    }
    public static void gwiazdki(int ile)
    {
        for(int i = 0; i<ile; i++)
            System.out.print("*");

        System.out.println();
    }
    public static void polekw(int bok)
    {
        if(bok > 0)
        System.out.println("Pole kwadratu to: " + bok*bok + " jednostek pola");
        else System.out.println("Nie liczę z ujemnej");
    }
    public static void poleprost (int a, int b)
    {
        if((a > 0) && (b > 0))
            System.out.println("Pole prostokąta to: " + a*b + " jednostek pola");
        else System.out.println("Nie liczę z ujemnego boku");
    }
    public static void polekola(int promien)
    {
        if(promien>0)
            System.out.println("Pole koła wynosi :" + (double)Math.PI*promien*promien);
        else
            System.out.println("Nie liczę z ujemnej.");
    }
    public static void poletr(int a, int h)
    {
        if ((a >= 0) && (h >=0))
            System.out.println("Pole trojkota to:" +( 0.5 * a * h ) + "jednostek pola");

        else System.out.println("nie licze z ujemniej dlugosci");
    }


}
