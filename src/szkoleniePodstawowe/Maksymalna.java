package szkoleniePodstawowe;

public class Maksymalna
{
    public static void main(String[] args) {
//        int a = 7, b = 3, c = 1;
//
//        if((a >= b) && (a >= c))
//        {
//            System.out.println("max a " + a);
//        }
//        else
//            if((b >= a) && (b >= c))
//            {
//                System.out.println("max b " + b);
//            }
//            else
//                if((c >= a) && (c >= b))
//                {
//                    System.out.println("max c " + c);
//                }
//
        int a = 7, b = 3, c = 1;
        int d = 9; //dodatkowe zadanie
        if((a >= b) && (a >= c) && (a >= d))
        {
            System.out.println("max a " + a);
        }
        else
            if((b >= a) && (b >= c)&& (b >= d))
            {
                System.out.println("max b " + b);
            }
            else
                if((c >= a) && (c >= b) && (c >= d))
                {
                    System.out.println("max c " + c);
                }
                else
                    if((d >= a) && (d >= b) && (d >= c))
                    {
                        System.out.println("max d " + d);
                    }

        int x = 0, y = 19, z = 19, zz = 8;
        int maxi = x;
        if(y >= maxi) maxi = y;
        if(z >= maxi) maxi = z;
        if(zz >= maxi) maxi = zz;
        System.out.println("szkoleniePodstawowe.Maksymalna liczba to: " + maxi);

        System.out.println("szkoleniePodstawowe.Maksymalna to:" + Math.max(Math.max(Math.max(x,y),z),zz));
    }
}
//if(true )
//{
        //}
// else
       // {

       // }