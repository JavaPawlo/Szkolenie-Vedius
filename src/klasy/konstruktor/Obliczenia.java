package klasy.konstruktor;

import java.util.Random;

public class Obliczenia
{
    public static void main(String[] args) {
        Dodawanie dodawanie = new Dodawanie(66,2);
        dodawanie.suma();
        dodawanie.setA(9);
        dodawanie.setB(999);
        System.out.println("Suma zmienionych liczb to: "+ dodawanie.getSuma());
        Dodawanie dodawanie3 = new Dodawanie(3, 5, 2);
        System.out.println("Suma 3 liczb to: " + dodawanie3.getSuma());
        Dodawanie a1 = new Dodawanie();
        System.out.println("Dodawane w konstruktorze domyslnym liczby to: a="
                +  a1.getA() + " ,b="+ a1.getB() + " ,c=" + a1.getC());
        Dodawanie a2 = new Dodawanie(999);
        System.out.println("Dodawane w konstruktorze jednoargumentowym liczby to: a="
                +  a2.getA() + " ,b="+ a2.getB() + " ,c=" + a2.getC());
        Dzielenie dzielenie = new Dzielenie(1, 9);
        System.out.println(dzielenie.iloraz());
        //odwołanie tablicowe
        int[] nazwa = new int[8];
        Dodawanie[] suma = new Dodawanie[5];
        suma[0] = new Dodawanie(2,6);
        suma[1] = new Dodawanie(2);
        suma[2] = new Dodawanie(2,6, 9);
        suma[3] = new Dodawanie();
        suma[4] = new Dodawanie(2,6);

        for(Dodawanie d: suma)
        {
            System.out.print("Kolejne liczby to: A=" + d.getA());
            System.out.print(", B=" + d.getB());
            System.out.print(", C=" + d.getC());
            System.out.print(", a suma liczb to: "+d.getSuma());
            System.out.println();
        }

        Random losowanie = new Random();
        Dodawanie[] tab = new Dodawanie[100];
        for(int i = 0; i < tab.length; i++)
        {
            tab[i] = new Dodawanie( losowanie.nextInt(200),
                                    losowanie.nextInt(1000),
                                    losowanie.nextInt(100));
        }

        for(Dodawanie d: tab)
        {
            System.out.print("Kolejne liczby to: A=" + d.getA());
            System.out.print(", B=" + d.getB());
            System.out.print(", C=" + d.getC());
            System.out.print(", a suma liczb to: "+d.getSuma());
            System.out.println();
        }



    }

}
