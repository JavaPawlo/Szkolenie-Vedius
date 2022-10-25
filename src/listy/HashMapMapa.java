package listy;

import java.util.HashMap;

public class HashMapMapa
{
    public static void main(String[] args) {
        HashMap<Integer, String> dzien = new HashMap<>();
        dzien.put(1,"poniedzialek");
        dzien.put(2,"wtorek");
        dzien.put(3,"sroda");
        dzien.put(4,"czwartek");

        System.out.println("Pierwszy dzien to: " + dzien.get(1));
        System.out.println("Wiekosc tablicy " + dzien.size());
        dzien.remove(3);
        for(String i: dzien.values())
        {
            System.out.println(i);
        }
        System.out.println("-------------------------- klucz -------------");
        for(Integer i: dzien.keySet())
        {
            System.out.println(i);
        }
        System.out.println("-------------------------- klucz wartosc -------------");
        for(Integer i: dzien.keySet())
        {
            System.out.println("Dzien " +  i + " to " + dzien.get(i));
        }

    }
}
