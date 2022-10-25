package listy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListyArrayList
{
    public static void main(String[] args) {
        //int[] tab = new int[1000000000];
        ArrayList<String> wyrazy = new ArrayList<>();
        System.out.println("Nasze wyrazy" + wyrazy);
        wyrazy.add("To");
        wyrazy.add("jest");
        //System.out.println("Nasze wyrazy" + wyrazy);
        wyrazy.add("nasza");
        wyrazy.add("wspaniala");
        wyrazy.add("lista");
        System.out.println("Nasze wyrazy" + wyrazy);

        for(String s: wyrazy)
        {
            System.out.print(s+ " ");
        }
        System.out.println();
        wyrazy.add(1,"nie");
        for(String s: wyrazy)
        {
            System.out.print(s+ " ");
        }
        wyrazy.remove(3);
        System.out.println();
        System.out.println(wyrazy);
        System.out.println("Czy lista zawiera slowo \"nie\" "+ wyrazy.contains("nie"));
        System.out.println("Na którym indeskie znajduje sie slow nie " + wyrazy.indexOf("nie"));
        System.out.println("Pobranie elementu z listy "+ wyrazy.get(1));
        System.out.println("Podmiana elementu z listy "+ wyrazy.set(3, "cudowna"));
        System.out.println(wyrazy.toArray());
        //size
        //clear

        //wyloswać 50 liczb i wpisać ją do listy.

    List<Integer> liczby = new ArrayList<>();
    int ile = 50;
    for(int i = 0; i < ile;i++)
    {
        liczby.add(new Random().nextInt(1000));
    }
        System.out.println(liczby);
//posortować listę rosnaco  i pozniej malejsco
        Collections.sort(liczby);
        System.out.println(liczby);
        Collections.reverse(liczby);
        System.out.println(liczby);

//        dodać na poczatek i na koniec liczby -999
        liczby.add(0,-999);
        liczby.add(-999);
        System.out.println(liczby);
        //liczby parzyste
        System.out.print("[");
        int parzyste = 0;
        for(Integer l : liczby)
        {
            if(l%2 == 0)
            {
                System.out.print(l+ ", " );
                parzyste++;
            }
        }
        System.out.println("]");
        System.out.println("Liczba liczb parzystych " + parzyste);

    }
}
