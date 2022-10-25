package klasy;

public class Zwierz
{
    String imie;
    int wiek;
    public void pijWode()
    {
        System.out.println("Pije wode");
    }
    public void dajGlos(String glos, int ile)
    {
        for(int i =0; i < ile; i++) {
            System.out.print(glos + " ");
        }
        System.out.println();
    }

}
