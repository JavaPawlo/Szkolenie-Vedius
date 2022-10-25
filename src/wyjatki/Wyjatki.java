package wyjatki;

public class Wyjatki {
    public static void main(String[] args) {
        double a = 1;
        double b = 0;
        //if(b != 0) zapobieganie błędowi
        try {
            System.out.println("dzielenie " + a / b);
        } catch (Exception e) {
            System.out.println("Błąd " + e.getMessage());
            System.out.println("Nie dziale przez zero");
        }

        int[] tab = new int[3];
        try {
            System.out.println(tab[10]);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Poza zakresem");
        }
        try
        {
            System.out.println("Dzielenie funkcja "+ dzielenie(a,b));
            System.out.println("Dzielenie poprawnie "+dzieleniePoprawnie(a,b));
        }
        catch (Exception e)
        {
            System.out.println("Nie dziele przez zero ale przy wywałaniu funkcji");
        }

    }

    private static double dzieleniePoprawnie(double a, double b) {
        double wynik = a/b;
        if(wynik == Double.POSITIVE_INFINITY)
            throw new ArithmeticException();
        return wynik;
    }

    public static double dzielenie(double a, double b)
    {
        double wynik = 0;
        //try {
            wynik =  a/b;
        //}
        //catch (Exception e)
        ///{
        //    System.out.println("W funkcji nie dziele przez zero");
        //}
        return  wynik;
    }
}
