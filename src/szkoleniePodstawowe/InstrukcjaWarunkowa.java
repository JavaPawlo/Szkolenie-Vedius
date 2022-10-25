package szkoleniePodstawowe;

public class InstrukcjaWarunkowa
{
    public static void main(String[] args)
    {
        int a = 0;
        if (a==1)
        {
            System.out.println("Jeżeli warunke jest prawdziwy");
        }
        else
        {
            System.out.println("Jeżeli warunke jest fałszywy");
        }
        //jesli x > 0 +
        //jesli x = 0 0
        //jesli x < 0 -
        int x = -6;
        if(x > 0)
        {
            System.out.println("Dodatnia");
        }
        else
        {
            if (x == 0)
            {
                System.out.println("zero");
            }
            else
            {
                System.out.println("ujemna");
            }

        }
        //inny sposób
        int y = 0;
        if(y > 0) System.out.println("dodatnia");
        if(y == 0) System.out.println("zero");
        if(y < 0) System.out.println("ujmena");

        //0 -18 lat bez akloholu
        // <18- 32 lat nie moge byc prezydentem
        // <32 - 60) prezydent
        //<60 - papież
        int wiek = 17;
        if ((wiek > 0) && (wiek < 18))
            System.out.println("bez alkoholu");
        if ((wiek >= 18) && (wiek < 32))
            System.out.println("bez prezydenta");
        if ((wiek >=32) && (wiek < 60))
            System.out.println("jestem prezydentem");
        if (wiek >=60)
            System.out.println("jestem papiezem");
        if (wiek <=0)
            System.out.println("blad");



    }
}
