package klasy.figuryPolimorfizmRzutowanieInstanceOf;

public class Kolo extends Figura {
    private int r;
    Kolo()
    {
        this.r = 1;
    }
    Kolo(int r)
    {
        this.r = r;
    }
    public double obliczPole()
    {
        return Math.PI*r*r;
    }
    @Override
    public String toString()
    {
        return "Pole kola o pormieniu r: "+ r + " to: " + obliczPole();
    }
}
