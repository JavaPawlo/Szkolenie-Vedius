package klasy.dziedziczenie;

public class Pojazd
{
    protected int kola;
    protected String kolor = "Bezbarwny";
    protected boolean czyDziala = false;
    Pojazd()
    {
        this.kola = 0;
        this.kolor = "Bezbrwny";
        this.czyDziala = false;
    }
    Pojazd(int kola, String kolor, Boolean czyDziala)
    {
        this.kola = kola;
        this.kolor = kolor;
        this.czyDziala = czyDziala;
    }

    public void uruchom()
    {
        czyDziala = !czyDziala;
    }
    public String czyDziala()
    {
        return czyDziala ? "Uruchomiony" : "Nie działa";
    }
    @Override
    public String toString()
    {
        return "Ilosc kol to: "+ kola + ", kolor: " + kolor + ", stan: " + czyDziala();
    }
    public void info()
    {
        System.out.println("INFO Ilosc kol to: "+ kola + ", kolor: " + kolor + ", stan: " + czyDziala());
    }

}
