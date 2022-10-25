package klasy.setIget;

public class PolaObwFigur
{
    public static void main(String[] args) {
        Kwadrat kw1 = new Kwadrat();
        //kw1.bok = 9;
        kw1.setBok(8);
        kw1.obliczPole();
        Kwadrat kw2 = new Kwadrat();
        kw2.setBok(-8);
        kw2.obliczPole();
        Kwadrat kw3 = new Kwadrat();
        kw3.setBok(5);
        System.out.println("Pole kwadratu o boku "+ kw3.getBok()+ " to: "+ kw3.getBok()*kw3.getBok()
                + "jednostek pola" );
        kw3.setBok(10);
        System.out.println("Po zmianie dlgosci boku");
        kw3.obliczPole();
        Kwadrat kw4 = new Kwadrat();
        kw4.setBok(35);
        kw4.obliczPole();
        kw4.obliczObwod();
        System.out.println("Moj kwadracik oboku " + kw4.getBok()+" ma pole: " + kw4.pole() + " jednostek pola");
        System.out.println("Moj kwadracik ma obwod: " + kw4.obwod() + " jednostek dlugosci");


    }


}
