package klasy.punktPolimorfizm;

public class PynktyMain {
    public static void main(String[] args) {
        Punkt[] tab = new Punkt[5];
        tab[0] = new Punkt3D(6,8,4);
        tab[1] = new Punkt(9);
        tab[2] = new Punkt2D(4,6);
        tab[3] = new Punkt(-4);
        tab[4] = new Punkt2D(4,-9);

        int i =1;
        for(Punkt p: tab )
        {
            System.out.println("Punkt "+ i +" = " + p);
            i++;
        }
        for(i = 0; i < tab.length; i++)
        {
            System.out.println("Punkt "+ i +" = " + tab[i]);
        }


        ((Punkt2D)tab[2]).ustawXY(-8,-8);
        System.out.println("Punkt tab[2] =" + tab[2]);

}
}
