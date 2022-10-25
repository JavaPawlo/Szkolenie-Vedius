package szkoleniePodstawowe;

public class Operatory
{
    public static void main(String[] args) {
        System.out.println("szkoleniePodstawowe.Operatory");
        int a = 1;
        int b = 2;
        int suma = a + b;
        System.out.println("Suma liczb to: "+ suma);
        int roznica = a - b;
        System.out.println("Roznica liczb to: "+ roznica);
        int iloczyn = a * b;
        System.out.println("Iloczyn liczb to: "+ iloczyn);
        int iloraz = a / b;
        System.out.println("Iloraz liczb to: "+ iloraz);

        int i = 0;
        i = i + 1;
        System.out.println("Liczba o 1 wiecej " + i);
        i++; //i=i+1
        System.out.println("Liczba o 1 wiecej " + i);
        i+=1;
        System.out.println("Liczba o 1 wiecej " + i);
        i+=10;
        System.out.println("Liczba o 10 wiecej " + i);

       a = 2; b = 2; int c = 2; int d = 2;
        System.out.println( "A oto wartosc poszczegolnych wyrazen\n" + "(nie mylic ze zmiennymi)\n" );

        System.out.println( "++a = " + ++a
                + " \n b++ = " + b++
                + " \n --c = " + --c
                + " \n d-- = " + d-- );
        // teraz sprawdzamy co jest obecnie w zmiennych
        System.out.println( "Po obliczeniu tych wyrazen, same " + "zmienne maja wartosci\n"

                + " a = " + a
                + " b = " + b
                + " c = " + c
                + " d = " + d) ;
        a+=2;
        b -= 2;
        c *=2;
        d /=2;
        System.out.println( "Po obliczeniu tych wyrazen:\n"
                + "a +=2 " + a
                + "b -=2 " + b
                + "c *=2 " + c
                + "d /=2 " + d) ;


}
}
