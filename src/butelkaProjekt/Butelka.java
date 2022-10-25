package butelkaProjekt;

public class Butelka {
    private double woda = 0.0;
    private int id = 0;

    public static int getNextId() {
        return nextId;
    }

    private static int nextId = 1;
    private final double max_objetosc = 20;

    Butelka(double woda) {
        if (woda > 0) {
            this.woda = woda;
            id = nextId++;
        } else {
            woda = woda * (-1);
            this.woda = woda;
            id = nextId++;
        }
    }

    void dolej(int woda) {
        if (woda > 0)
            this.woda += woda;
    }

    void wylej(double woda) {
        if (woda < 0)
            woda *= -1;
        if (this.woda > woda)
            this.woda -= woda;
        else
            this.woda = 0;
    }

    void przelej(double wodaIle, Butelka gdzie )
    {
        if(wodaIle > 0)
        {
            if(this.woda >= wodaIle)
            {
                this.woda -= wodaIle;
                gdzie.woda += wodaIle;
                System.out.println("Z butelki o id: " + this.id +
                        " przelano " + wodaIle +
                        "do butelki o id: " + gdzie.id);
            }
            else
            {
                //System.out.println("Za mało wody, twój stan to: "+ this.woda);
                double tyleBylo = this.woda;
                double braklo = wodaIle - this.woda;
                gdzie.woda += this.woda;
                this.woda = 0;
                System.out.println("Z butelki o id: " + this.id +
                        " przelano tylko " + tyleBylo + " brakło: " + braklo +
                        " do butelki o id: " + gdzie.id);
            }
        }
        else
        {
            System.out.println("Nie przelewam ujemnej wody");
        }

    }

    public double getWoda() {
        return woda;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString()
    {
        return "Butelka o id: " + getId() + ", stan wody: " + getWoda();
    }
}
