package szkoleniePodstawowe;

public class Tablice {
    public static void main(String[] args) {
        int o1 = 4;
        int o2 = 5;
        int o3 = 1;
        System.out.println("o1=" + o1);
       // String imie[] = new String[3];
        String[] imie = new String[3];
        imie[0] = "Ula";
        imie[1] = "Ewa";
        imie[2] = "Ila";
      //  imie[3] = "Ktos"; nie działa bo mamy rozmiar tablicy 3
        System.out.println("imie1 " + imie[0]);
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Kto idze na piwo " + imie[i]);
        }
        int[] liczby = {5,5,5,3,2,4,6,7,8,9,1,2,1,2,45,5,4,5,5,4,6,4,22,2,5};
        for(int i = 0; i < liczby.length; i++)
        {
            System.out.println("Liczby " + i +" z tablicy to: " + liczby[i]);
        }
        o1 =6;
        liczby[2] = -100;
        for (int x: liczby)
        {
            System.out.println("Elementy z tablicy liczby za pomocą foreach " + x);
        }
        //podmień ostatni element tablicy na -200
        int ostatni = liczby.length - 1;
        System.out.println("Indeks ostatniego elementu to: "+ ostatni);
        liczby[ostatni] = -200;
        for(int i = 0; i < liczby.length; i++)
        {
            System.out.println("Liczby " + i +" z tablicy to: " + liczby[i]);
        }
        System.out.println("od konca tablicy");
        for(int i = liczby.length - 1; i >= 0 ; i--)
        {
            System.out.println("od konca " + i +" z tablicy: " + liczby[i]);
        }
        //wpisz do tablicy 10 kolejnych liczb parzystych począwszy od 2 i je odczytaj
        int parzysta = 2;
        int[] tblParzystych = new int[100];
        for(int i = 0; i < 10; i++) {
            //System.out.println("Parzysta " + parzysta);
            tblParzystych[i] = parzysta;
            parzysta+=2;
            System.out.println("Element z tablicy parzyste to: " + tblParzystych[i]);
        }
        }
    }

