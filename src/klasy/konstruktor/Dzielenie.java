package klasy.konstruktor;

public class Dzielenie
{
    private int a;
    private int b;
    Dzielenie(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public int iloraz() {
        return a / b;
    }
}
