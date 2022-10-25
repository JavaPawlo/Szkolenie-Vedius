package funkcje;

public class Funkcje
{

    public static void main(String[] args)
    {
        double pierwiastek = Math.sqrt(3);
        System.out.println("Pierwiastek " + pierwiastek);
        dodawanie();
        dodawanie(3,5);
        dodawanie(6,7);
        dodawanie(7,-9);
        int a=8, b =9;
        roznica(a,b);
        int karteczka = mnozenie();
        System.out.println("Wynik mnozenia to: " + (double)karteczka/5);
        System.out.println("Wynik dzielenia to " + iloraz(1,8));

    }
    public static double iloraz(double x, double y) //funkcja która zwraca w wyniku swojego
    // działania liczbę typ rzeczywistego do miejsca swojgo wywołania
    // i przyjmie dwa argumenty typu rzeczywistego
    {
            return x/y; //pozniej try catch
    }
    public static int mnozenie()// funkcja mnożenie nie przyjmie zadnych argumentów,
    // ale za to zwróci do miejsca swojego wywołania liczbę typu całkowitego
    {
        int a = 1, b = 1;
        int iloczyn = a * b;
        return iloczyn;
    }
    public static void roznica(int mojSzefToIdiota, int bii)
    {//funkcja roznica, która nic nie zwróci i przyjmnie dwa argumenty typu całkowitego
        int sum = mojSzefToIdiota - bii;
        System.out.println("Suma " + sum);
    }
    public static void dodawanie(int a, int b) //przeciązanie nazwy metody
    {
        int suma = a + b;
        System.out.println("Suma = " + suma);
    }
    public static void dodawanie()
    { //funkcja dodawanie, która nic nie zwróci oraz nie przyjmnie zadnych argumentów
        int a = 6; int b =8;
        int suma = a + b;
        System.out.println("Suma = " + suma);
    }



}
