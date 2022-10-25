package klasy;

public class ZwierzTest {

    public static void main(String[] args) {
        int a;
        Zwierz kot = new Zwierz();
        kot.imie = "Mruczyslaw";
        kot.wiek = 2;

        System.out.println("Imie kota to: " + kot.imie);
        System.out.println("Wiek kota to: " + kot.wiek);
        kot.pijWode();
        kot.dajGlos("Miau", 6);


        Zwierz pies = new Zwierz();
        pies.imie = "Bury";
        pies.wiek = 1;
        System.out.println("\nImie psa to: " + pies.imie);
        System.out.println("Wiek psa to: " + pies.wiek);
        pies.pijWode();
        pies.dajGlos("Hau", 9);

        kot.imie = "Mruczek";
        kot.wiek = 1;
        System.out.println("Po zmianie imie kota to: " + kot.imie);
        System.out.println("Po zmianie  wiek kota to: " + kot.wiek);

    //   String kotimie = "Filemon";
     //   int wiek = 15;

//        String piesimie= "Ciapek";
//        int wiekpies = 1;

    }
}
