package szkoleniePodstawowe;

public class Kalkulator
{
    public static void main(String[] args) {
        System.out.println("Prosty kalkulator");
        System.out.println("Wybierz + aby dodawac");
        System.out.println("Wybierz - aby odejmowac");
        System.out.println("Wybierz * aby mnozyc");
        System.out.println("Wybierz / aby dzielic");
        int a = 1, b = 0;
        char wybor = '/';
        switch (wybor)
        {
            case '+' -> System.out.println("Suma liczb to: " + (a+b));
            case '-' -> System.out.println("Roznica liczb to: " + (a-b));
            case '*' ->System.out.println("Iloczyn liczb to: " + (a*b));
            case '/' -> {
                if (b != 0) {
                    System.out.println("Iloraz liczb to: " + (a / b));
                } else {
                    System.out.println("Nie dziele przez zero");
                }
                        }
            default -> System.out.println("bledny wybor");
        }


    }
}
