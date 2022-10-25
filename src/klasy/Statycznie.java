package klasy;

import java.util.Random;

public class Statycznie {
    public static void main(String[] args) {
       // Kolo kolo1 = new Kolo(5);
       // Kolo kolo2 = new Kolo(5);
        System.out.println("Do tej pory stworzono " + Kolo.id + " obiektów klasy Koło");
     //   Kolo kolo3 = new Kolo(5);
     //   Kolo kolo4 = new Kolo(5);

        Kolo[] tab = new Kolo[10];
        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = new Kolo(new Random().nextInt(50));
        }
        System.out.println("Po petli stworzono " + Kolo.id + " obiektów klasy Koło");

        for (Kolo k: tab)
        {
            System.out.println("Id naszego obiektu to: "+ k.getId2());
            System.out.println("Ile obiektów wygenerowano "+ Kolo.id);
            System.out.println("Obliczone pole dla obiektów: " + k.pole());
        }
        System.out.println("Obiekt 5 ma id "+ tab[4].getId2());

        //System.out.println("Moje statyczne oblcizenie " + Kolo.polcizPoleKola(7));//Math.sqrt(7) );
    }
}
class Kolo
{
    private int r;
    private final static double PI = 3.14;
    public static int id = 0;

    public int getId2() {
        return id2;
    }

    private int id2;
    private static int nextId = 1;

    Kolo(int r)
    {
        this.r =r;
        id++;
        id2 = nextId;
        nextId++;
    }
    public double pole()
    {
        return Math.PI*r*r;
    }

    public void setR(int r) { //ps
        this.r = r;
    }

    public int getR() { //pg
        return r;
    }
    public static double polcizPoleKola(double r)
    {
        //PI = PI * 2;
        return PI*r*r;
    }
}
