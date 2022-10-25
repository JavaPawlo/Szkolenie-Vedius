package listy;

import java.lang.reflect.Array;
import java.util.*;

public class UnikalneDowolne
{
    public static void main(String[] args) {
        System.out.println("unikalne losowe");
        System.out.println("Podaj zakres licz do wylosowania");
        int zakres = new Scanner(System.in).nextInt();
        System.out.println("Ile liczb chcesz wylosować ");
        int ile = new Scanner(System.in).nextInt();

        HashSet<Integer> unikalne = new HashSet<>();
        System.out.println("Lista unikalnych" +
                wylosujUnikalne(zakres, ile, unikalne));
    }

    private static HashSet<Integer> wylosujUnikalne(int zakres,
                                                    int ile,
                                                    HashSet<Integer> unikalne) {
        if (ile < zakres) {
            while (unikalne.size() < ile) {
                unikalne.add(new Random().nextInt(1, zakres));
            }
        }
        return unikalne;
    }

}
