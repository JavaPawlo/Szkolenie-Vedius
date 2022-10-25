package klasy;

public class NadpisywanieMetod {
    public static void main(String[] args) {
        Kwadrat kw1 = new Kwadrat(8);
        System.out.println(kw1);

    }
}
class Kwadrat
{
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Kwadrat(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "a=" + a +
                '}';
    }

    private int a;

    public void opis()
    {
        System.out.println("Obliczone pole dla boku: "
                + getA() + " =  " + a*a);
    }
    //@Override
   // public String toString()
   // {
   //     return "Obliczone pole dla boku: " + getA() + " =  " + a*a;
   // }

}
