package klasy.setIget;

public class Kwadrat
{
    private int bok;
    public void setBokDouble(int bok)
    {
        if(bok > 0 ) this.bok = bok;
        else this.bok = 0;
    }
    public void setBok(int a)
    {
        if(a>0)
        {
            bok = a;
        }
        else
        {
            System.out.println("Mały problem ujemna dlugość i ja to przewiadziałęm i monoże *-1");
            bok = a*(-1);
        }
    }
    public int getBok()
    {
        return bok;
    }
    public void obliczPole()
    {
        System.out.println("Pole kwadratu o boku " + bok + " to: "
                + bok*bok + " jednostek pola");
    }
    public int pole()
    {
        return bok*bok;
    }
    public int obwod()
    {
        return 4*bok;
    }
    public void obliczObwod()
    {
        System.out.println("Obwód kwadratu o boku " + bok + " to: "
                + obwod() + " jednostek dlugosci");
    }
}
