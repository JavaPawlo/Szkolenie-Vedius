package szkoleniePodstawowe;

import java.util.Arrays;

public class TabLosowa20Elementow {
    public static void main(String[] args) {
        //Stwórz tablicę 20-elementowa
        //Uzupelnij ja liczbami losowymi z zakresu od 0 do 200
        //Zsumij elementy tablicy
        //policz srednia z elementow tablicy

        int[] tab = new int[10];
        int suma = 0;
        double srednia = 0;
        for(int i = 0; i < tab.length;i++)
        {
            tab[i] = (int)(Math.random()*201);
            System.out.println("Tablcia tab[" + i +"] =" + tab[i]);
            suma = suma + tab[i];
        }
        System.out.println("suma elementow z tablicy to: " + suma);
        System.out.println("Srednia z tablicy to:" + (double)suma/(tab.length));
        //wypisz pierwszy i ostatni element tablicy
        System.out.println("pierwszy element tablicy " + tab[0]);
        System.out.println("Ostatni element tablicy" + tab[tab.length - 1]);

        //wypisz jej elemnty od konca
        for(int i =  tab.length - 1; i >= 0; i-- )
        {
            System.out.print("[" + tab[i]+ "],");
        }
        System.out.println();
        System.out.println(Arrays.toString(tab));
        //wypisz liczbę maksymalna oraz mimimalna
        int najwieksza = tab[0];
        int najmniejsza = tab[0];
        for(int i = 1; i < tab.length;i++) {
            if(tab[i] > najwieksza) najwieksza = tab[i];
            if(tab[i] < najmniejsza) najmniejsza = tab[i];
        }
        System.out.println("Najwieksza liczba to: " + najwieksza);
        System.out.println("Najmniejsza liczba to: " + najmniejsza);
    }
}
