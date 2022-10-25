package klasy.klasyAbstrakcyjne;

public class Kolo extends Figura {
    private double r;
    Kolo()
    {
        this.r = 1;
    }
    Kolo(double r)
    {
        this.r = r;
    }
    @Override
    public double obliczPole()
    {
        return Math.PI*r*r;
    }
    @Override
    String zJakiejKlasy() {
        return getClass().getName();
    }
    @Override
    public String toString()
    {
        return "Pole kola o pormieniu r: "+ r + " to: " + obliczPole();
    }
}
