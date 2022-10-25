package klasy.interfejsy;

public class Kwadrat extends Figura implements Poruszanie{
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
    @Override
    public String wLewo() {
        return "Kwadrat przemieszczam sie w lewo ";
    }

    @Override
    public String wPrawo() {
        return "Kwadrat przemieszczam sie w prawo";
    }
}
