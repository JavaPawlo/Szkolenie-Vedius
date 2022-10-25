package szkoleniePodstawowe;

public class PseudoSortowanie
{
    public static void main(String[] args) {
        int a = 7, b = 3, c = 1;
        if (a < b) //ab
        {
            if (c < a)
            {
                System.out.println("Kolejnosc c="+c+" a="+a+" b="+b);
            }
            else //acb abc
            {
                if(c < b) //acb
                {
                    System.out.println("Kolejnosc a="+a+" c="+c+" b="+b);
                }
                else //abc
                {
                    System.out.println("Kolejnosc a="+a+" b="+b+" c="+c);
                }
            }
        }
        else //ba
        {
            if (c < b)
            {
                System.out.println("Kolejnosc c="+c+" b="+b+" a="+a);
            }
            else
            {
                if(c < a)
                {
                    System.out.println("Kolejnosc b="+b+" c="+c+" a="+a);
                }
                else
                {
                    System.out.println("Kolejnosc b="+b+" a="+a+" c="+c);
                }
            }
        }
    }
}
