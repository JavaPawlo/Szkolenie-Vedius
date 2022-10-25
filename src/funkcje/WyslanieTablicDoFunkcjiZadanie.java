package funkcje;

import java.util.Arrays;
import java.util.Random;

public class WyslanieTablicDoFunkcjiZadanie
{
    public static void main(String[] args) {
        //stórz dwie tablice
        int[] tab1 = new int[50];
        int[] tab2 = new int[50];
        //wyślij tablice do funkjci i uzupełnij ja liczba losowymi
        uzupelnijLosowo(tab1);
        System.out.println(Arrays.toString(tab1));
        tab2 = podwojenie(tab1);
        System.out.println(Arrays.toString(tab2));
        //stwórz funkcje, która podwaja elementy z tablicy
        //stwórz funkcje, która przepisuje do nowej (drugiej tablicy)
        // +100 elementy i zwraca do miejsca wywołania (wypisuje tablice 2)
    }
    public static void uzupelnijLosowo(int[] tab)
    {
        for (int i = 0; i< tab.length; i++)
        {
            tab[i] = new Random().nextInt(100);
        }
    }
    public static int[] podwojenie(int[] tab)
    {
        for (int i = 0; i< tab.length; i++)
        {
            tab[i] = tab[i]*2;
        }
        return tab;
    }
}
