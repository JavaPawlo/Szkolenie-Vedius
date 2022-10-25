package klasy.punkty;

public class PynktyMain {
    public static void main(String[] args) {
        Punkt p1 = new Punkt(7);
        System.out.println(p1);
        p1.setX(-9);
        System.out.println(p1);
        Punkt2D p2d2 = new Punkt2D(9,8);
        System.out.println(p2d2);
        p2d2.setX(8);
        p2d2.setY(4);
        System.out.println(p2d2);
        p2d2.ustawXY(-9,-7);
        System.out.println(p2d2);

        Punkt3D p3d3 = new Punkt3D(4,7,-6);
        System.out.println(p3d3);
        p3d3.ustawXYZ(-9,-8,0);
        System.out.println(p3d3);

    }
}
