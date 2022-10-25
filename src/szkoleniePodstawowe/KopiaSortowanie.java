package szkoleniePodstawowe;

import java.util.Arrays;
import java.util.Collections;

public class KopiaSortowanie {
    public static void main(String[] args) {
        Integer[] tab =  {5,5,6,4,9};

        System.out.println(Arrays.toString(tab));
        Integer[] kopia;
        kopia = tab;
        tab[0] = 999;
        System.out.println("Referenycje kopiowanie");
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(kopia));
        System.out.println("Fizyczne kopiowanie");
        kopia = Arrays.copyOf(tab, tab.length);
        tab[0] = 222;
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(kopia));

        System.out.println("sortowanie rosnaco");
        Arrays.sort(kopia);
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(kopia));
        System.out.println("sortowanie malejaco");
        Arrays.sort(kopia, Collections.reverseOrder());
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(kopia));

    }
}
