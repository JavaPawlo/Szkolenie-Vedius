package klasy.klasyAbstrakcyjne;

public class Kwadrat extends Figura {
   private double a;

    public Kwadrat(double a) {
        this.a = a;
    }
    @Override
    public double obliczPole()
    {
        return a*a;
    }

    @Override
    String zJakiejKlasy() {
        return getClass().getName();
    }

    @Override
    public String toString() {
        return "Pole kwadratu o boku a: "+ a + " to: " + obliczPole();
    }
}
