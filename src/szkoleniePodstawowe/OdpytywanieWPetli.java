package szkoleniePodstawowe;

import java.util.Scanner;

public class OdpytywanieWPetli
{
    public static void main(String[] args)
    {

        // podaj ="";
        while (1==1)
        {
            Scanner tekst = new Scanner(System.in);
            System.out.println("podaj tekst - napisz koniec aby zakonczyć");
            String podaj = tekst.nextLine();
            if(podaj.equals("koniec"))
            {
                break;
            }
        }
    }
}
