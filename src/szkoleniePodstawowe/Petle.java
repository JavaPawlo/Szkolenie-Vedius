package szkoleniePodstawowe;

public class Petle {
    public static void main(String[] args) {
        //wypisz liczby od 1 do 5
        int i = 1; //warunek poczatkowy petli
        while (i <= 5) //warunek kontynuacji petlu lub konca petli
        {
            System.out.println("Kolejna liczba w petli while to: " + i);
            i++; //instrukcja z jakim krokiem mam dojsc do konca petli
        }
        i = 1;
        do {
            System.out.println("Kolejna liczba w petli do while to: " + i);
            i++;
        } while (i <= 5);
        //liczby parzyste z przedziału od zera do 50
        int p = -2;
        while (p <= 50) {
            p += 2;
            System.out.println("Kolejna liczba parzysta to: " + p);
        }
        // for(od_kiedy_zaczac;do_kiedy_doliczyc;z_jakim_krokiem)
        //  {
        //instrukjce
        //   }
        for (i = 1; i <= 5; i++) {
            System.out.println("Kolejna liczba w ptetli for to: " + i);
        }

        //od 10 do 1 i na koncu napisać bum
        for (int a = 10; a >= 0; a--) {
            System.out.println("Odliczam " + a);
        }
        System.out.println("BUM tarara bum bum");
        //wypisz dokladnie 20 liczb począwszy do 150  z krokiem co 5
        int liczba = 150;
        for (int ile = 0; ile < 20; ile++) {
            System.out.println("Liczba do wypsiania " + liczba);
            liczba -= 5;
        }
        //policz sumę 10 kolejnych liczb począwszy od 1
        int suma = 0;
        for (int kolejna = 1; kolejna <= 10; kolejna++) {
            suma = suma + kolejna;
            System.out.println("Chwilowa suma to: " + suma);
        }
        System.out.println("Całkowita suma to: " + suma);

        //wypisz kwadrat z gwiazdek '*' 10x10
        //***
        //***
        //*** 3x3
        for (int wiersze = 0; wiersze < 10; wiersze++) {
            for (int k = 0; k < 10; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
//choinka
        for (int wiersze = 1; wiersze <= 10; wiersze++) {
            for (int k = 1; k <= wiersze; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //policz tabliczę mnożenia do 10
        for (int wiersze = 1; wiersze <= 10; wiersze++) {
            for (int kolumny = 1; kolumny <= 10; kolumny++) {
                System.out.print(wiersze * kolumny + " ");
            }
            System.out.println();
            //wypisz liczby od 10 do 100 bez liczb od 50 do 60
            for(int kontynuj= 10; kontynuj<=100; kontynuj++)
            {
                if((kontynuj>=50) && (kontynuj<=60)) continue;
                else System.out.println("koleja liczba to:" + kontynuj);

            }
            //wypisz liczby od 1 do 1000, jak zobaczysz liczbę 5 to przerwij działanie petli
            for(int przerwij = 1; przerwij <= 1000; przerwij++)
            {
                if(przerwij==5) break;
                else System.out.println("Liczby:" + przerwij);
            }
            //wariancje
            int j = 1;
            for(    ; ;    )
            {
                if(j<11)
                {
                    System.out.println("Fajne liczby to: " + j);
                    j++;
                }
                else break;
            }

            for(int m = 0, n = 10; ((m< 10) && (n<50)); m++, n+=10)
            {
                System.out.println("M=" +m);
                System.out.println("N=" +n);

            }
            int losowa = 0;
            for(int petla =0; petla < 20; petla++)
            {
                losowa = (int)(Math.random()*(100-1+1)+1);
                System.out.println("Losowa liczba to: " + losowa);
            }
            //wypisz 20 liczb losowych z przedziału od 1 do 100, podzielnych przez 3,
            // wypisz również ilość losowań
            int los = 0;
            int podzielna3 = 0;
            int iloscLosowan = 0;
            while(podzielna3 < 20)
            {
                los = (int)(Math.random()*(100-1+1)+1);
                if(los%3 == 0)
                {
                    podzielna3++;
                    System.out.println("Podzielana przez 3 = " + los);

                }
                iloscLosowan++;
            }
            System.out.println("Ilosc losowan w petli while "+ iloscLosowan);
        }
    }
}