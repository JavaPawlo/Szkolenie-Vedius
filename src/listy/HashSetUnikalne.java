package listy;

import java.util.HashSet;
import java.util.Random;

public class HashSetUnikalne
{
    public static void main(String[] args) {
        HashSet<String> samochody = new HashSet<>();
        samochody.add("BMW");
        samochody.add("BMW");
        samochody.add("Volvo");
        samochody.add("Skoda");
        samochody.add("Skoda");
        System.out.println("Samochody " + samochody);
        System.out.println("Zawiera: " + samochody.contains("BMW"));
        samochody.remove("Skoda");
        System.out.println("Samochody po remove " + samochody);
        System.out.println("Rozmiar "+ samochody.size());

        //dodać do listy 3 losowe liczby z przedziału od 1 do 10;
        //stworzyć petle  do 10 i wypsaić komuniakt
        // o tym czy dana liczba znajduje się  na liście
        HashSet<Integer> liczby = new HashSet<>();
        for(int i =0 ; i <3; i++) {
            liczby.add(new Random().nextInt(1, 11));
        }
        System.out.println("Liczby" + liczby);
        for(int i = 1; i <= 10; i++)
        {
            if(liczby.contains(i))
            {
                System.out.println("Liczba znajduje się na liscie ");
            }
            else
            {
                System.out.println("Liczba nie znajduje się na liscie ");
            }
        }
    }
}
