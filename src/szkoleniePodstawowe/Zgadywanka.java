package szkoleniePodstawowe;

import java.util.Random;
import java.util.Scanner;

public class Zgadywanka
{
    //Wylosuj liczbę, zapytaj użytkownika aby podał liczę.
    //Jeżeli udało mu się odgadnąć liczbę zakończ program.
    //W przeciwnym wypadku podpowiedz użytkownikowi czy liczba którą
    //podał jest za mała lub za dużo w stosunku do wylosowanej liczby.
    //Na końcu podaj ilość prób zgadnięcia.
    public static void main(String[] args) {
        int los = new Random().nextInt(100)+1;
        System.out.println("Wylosowana " + los);
        int ile = 0;
        while (true)
        {
            System.out.println("Podaj liczne do zgadniecia");
            int traf = new Scanner(System.in).nextInt();

            if (los == traf) {
                System.out.println("Gratulacje " + los);
                System.out.println("Udało sie w " + (ile+1) + " próbach");
                break;
            } else {
                if (traf < los) {
                    System.out.println("za mała");
                } else {
                    System.out.println("za duża");
                }
            }
            ile++;
        }

    }
}
