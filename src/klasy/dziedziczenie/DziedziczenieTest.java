package klasy.dziedziczenie;

import klasy.Statycznie;

public class DziedziczenieTest
{
    public static void main(String[] args) {
        Samochod s1 = new Samochod();
        s1.kola = 4;
        s1.kolor = "Czerwony";
        System.out.print("Moj nowy samochod ma " + s1.kola + " koła");
        System.out.println(" i kolor:  " + s1.kolor);
        System.out.println("czy nasz samochod działa: " + s1.czyDziala());
        s1.uruchom();
        System.out.println("czy nasz samochod działa: " + s1.czyDziala());
        s1.marka = "BMW";
        System.out.println("Marka naszego samochodu to: " + s1.marka);
        //System.out.println("s1: " + s1);
        s1.info();
        Samochod s2 = new Samochod();
        System.out.println("s2: " + s2);
        //Pojazd s3 = new Pojazd(4, "Czarny", true);
        //s3.info();
        Samochod s4 = new Samochod(4, 100, 1.5 ,"Skoda", 7);
        s4.uruchom();
        s4.info();
        Samochod s5 = new Samochod(4, "Niebieski", true, 100, 1.5 ,"Skoda", 7);
        s5.uruchom();
        s5.info();



    }
}
