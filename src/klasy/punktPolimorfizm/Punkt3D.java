package klasy.punktPolimorfizm;

public class Punkt3D extends Punkt2D {
    private int z ;
    Punkt3D()
    {
        this.z = 0;
    }
    Punkt3D(int x, int y, int z)
    {
        super(x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + ", punkt z=" +z;
    }
    public void ustawXYZ(int x , int y, int z)
    {
        super.ustawXY(x,y);
        this.z = z;
    }
}
