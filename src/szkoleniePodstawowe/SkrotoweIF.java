package szkoleniePodstawowe;

public class SkrotoweIF
{
    public static void main(String[] args) {
        int liczba = 5;
        String plec = "";
        if(liczba%2 == 0)
        {
            plec = "kobieta";
        }
        else
        {
            plec = "mezyczyzna";
        }
        System.out.println("plec " + plec);

        plec = (liczba%2 == 0) ? "kobieta" : "mezyczyzna";
        System.out.println("plec " + plec);
        int cos = (liczba<10) ? 4 : -4;
    }
}
