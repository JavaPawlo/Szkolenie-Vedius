package listy;

import java.util.ArrayList;

public class ListyObiekty
{
    public static void main(String[] args) {
        Osoby os1 = new Osoby("Ela");
        Osoby os2 = new Osoby("Ula");
        Osoby os3 = new Osoby("Ila");
        ArrayList osoby = new ArrayList();
        osoby.add(os1);
        osoby.add(os2);
        osoby.add(os3);
       // osoby.add(5);
        System.out.println(((Osoby)osoby.get(0)).imie);
        for(Object l: osoby)
        {
           // System.out.println("imie " + ((Osoby)osoby).imie);
        }

        ArrayList<Osoby> listaOsob = new ArrayList<>();
        listaOsob.add(os1);
        listaOsob.add(os2);
        listaOsob.add(os3);

        for(Osoby l: listaOsob)
        {
            System.out.println("imie " + l.imie);
        }
        // czy można usunąć
        //zastapić


    }
}
class Osoby
{
    public String imie;
    Osoby(String imie)
    {
        this.imie= imie;
    }
}
