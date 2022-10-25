package klasy.interfejsy;

import java.util.Random;

public class InterfejsyMain {
    public static void main(String[] args) {

        //Figura jakas = new Figura();  błąd
        Figura[] tab = new Figura[8];
        for(int i =0, j =1; i < tab.length; i+=2, j+=2)
        {
            //if(j <= tab.length-1)
           // {
                tab[i] = new Kolo(new Random().nextDouble());
                tab[j] = new Kwadrat(new Random().nextDouble());
            //}
           // else break;
        }
        for(Figura f: tab)
        {
            System.out.println("Pole klasy " + f.zJakiejKlasy() +" to:" + f.obliczPole());
            System.out.println(f.wLewo());
        }



    }
}
