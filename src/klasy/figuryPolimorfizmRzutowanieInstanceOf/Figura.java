package klasy.figuryPolimorfizmRzutowanieInstanceOf;

public class Figura extends Object{
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

}
