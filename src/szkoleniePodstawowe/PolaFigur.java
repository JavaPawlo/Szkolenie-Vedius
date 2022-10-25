package szkoleniePodstawowe;

public class PolaFigur
{
    public static void main(String[] args) {
        System.out.println("1 - pole kw");
        System.out.println("2 - pole kola");
        System.out.println("3 - pole prost");
        int wybor = 3;
        switch (wybor)
        {
            case 1 -> {System.out.println("pole kw");}
            case 2 -> {System.out.println("pole kola");}
            case 3 -> {System.out.println("pole prost");}
            default -> System.out.println("Bledny wybor");
        }
       /*
        //kwadrat
        int bok = -9;
        if (bok >=0)
        {
            int pole = bok * bok;
            System.out.println("Pole kw = " + pole + " jednostek pola");
        }
        else System.out.println("nie licze z ujemnej dlugosci");
        //kolo
        int promien = 8;
        if (promien >=0)
        {
            double pole = Math.PI*promien*promien;
            System.out.println("Pole kola = " + pole + " jednostek pola");
        }
        else System.out.println("nie licze z ujemnej dlugosci");
        //prost
        int bok1 = 8;
        int bok2 = 90;
        if ((bok1 >=0) && (bok2 >=0))
        {
            double pole = bok1* bok2;
            System.out.println("Pole prostokata = " + pole + " jednostek pola");
        }
        else System.out.println("nie licze z ujemnej dlugosci");

        */
    }
}
