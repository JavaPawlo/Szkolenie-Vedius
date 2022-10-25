package szkoleniePodstawowe;

import java.util.Scanner;

public class KalkulatorPodaj
{
    public static void main(String[] args) {
        while (true)
        {
            System.out.println("Prosty kalkulator");
            System.out.println("Wybierz + aby dodawac");
            System.out.println("Wybierz - aby odejmowac");
            System.out.println("Wybierz * aby mnozyc");
            System.out.println("Wybierz / aby dzielic");
            System.out.println("Napisz koniec aby zakonczyć");
            String wybor = new Scanner(System.in).nextLine();
            if(wybor.equals("koniec"))
            {
                break;
            }
            System.out.println("Podaj pierwszą liczbe");
            int a = new Scanner(System.in).nextInt();
            System.out.println("Podaj drugą liczbe");
            int b = new Scanner(System.in).nextInt();
            switch (wybor) {
                case "+" -> System.out.println("Suma liczb to: " + (a + b));
                case "-" -> System.out.println("Roznica liczb to: " + (a - b));
                case "*" -> System.out.println("Iloczyn liczb to: " + (a * b));
                case "/" -> {
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
}
