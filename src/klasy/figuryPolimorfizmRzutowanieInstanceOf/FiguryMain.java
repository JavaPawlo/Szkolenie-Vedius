package klasy.figuryPolimorfizmRzutowanieInstanceOf;

import java.util.Random;

public class FiguryMain
{
    public static void main(String[] args) {
        Figura[] tab = new Figura[10];
        for(int i =0, j =1; i < tab.length; i+=2, j+=2)
        {
            tab[i] = new Kolo(new Random().nextInt(10));
            tab[j] = new Kwadrat(new Random().nextInt(10));
        }
        for(Figura f: tab)
        {
            System.out.println(f.toString());
        }
        //System.out.println(tab[0].);
        System.out.println(((Kolo)tab[0]).obliczPole());

        for(Figura f: tab)
        {
            if(f instanceof Kolo) {
                System.out.println(((Kolo) f).obliczPole());
            }
            else
            {
                System.out.println(((Kwadrat) f).obliczPole());
            }
        }

    }
}
