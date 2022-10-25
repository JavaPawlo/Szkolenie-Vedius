package listy;

import java.util.LinkedList;

public class LinkedListKontenery
{
    public static void main(String[] args) {
        LinkedList<String> samochody = new LinkedList<>();
        samochody.add("Maluch");
        samochody.add("Polonez");
        samochody.add("Fiat 125");
        samochody.add("Syrenka");

        System.out.println("Nasza lista "+ samochody);
        samochody.removeFirst();
        System.out.println("Nasza lista po "+ samochody);
        System.out.println("Pierwszy " + samochody.getFirst());
        //usun ostatni
        //wypisz ostatni
        //pobierz ostatni
    }
}
