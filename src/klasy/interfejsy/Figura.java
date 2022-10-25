package klasy.interfejsy;

public abstract class Figura implements Poruszanie{
    protected String kolor ;
    protected boolean wypelnienie;
    Figura()
    {
        this.kolor = "bezbarwny";
        this.wypelnienie = true;
    }

    Figura(String kolor, boolean wypelnienie)
    {
        this.kolor = kolor;
        this.wypelnienie = wypelnienie;
    }
    abstract double obliczPole();
    abstract String zJakiejKlasy();

}
