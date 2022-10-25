package klasy.punktPolimorfizm;

public class Punkt {
    protected int x;
    Punkt()
    {
        this.x = 0;
    }
    Punkt(int x)
    {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public String toString()
    {
        return "Punkt x=" + x;
    }
}
