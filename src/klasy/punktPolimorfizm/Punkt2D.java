package klasy.punktPolimorfizm;

public class Punkt2D extends Punkt {
    protected int y;
    Punkt2D()
    {
        this.y= 0;
    }
    Punkt2D(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
    public void ustawXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString() + ", punkt y="+ y;
    }
}
