package klasy.figuryPolimorfizmRzutowanieInstanceOf;

public class Kwadrat extends Figura {
   private int a;

    public Kwadrat(int a) {
        this.a = a;
    }
    public int obliczPole()
    {
        return a*a;
    }

    @Override
    public String toString() {
        return "Pole kwadratu o boku a: "+ a + " to: " + obliczPole();
    }
}
