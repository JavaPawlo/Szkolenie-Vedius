package szkoleniePodstawowe;

public class Matematyka
{
    public static void main(String[] args)
    {
        System.out.println("Potega " + Math.pow(2,32));
        System.out.println("Pierwiastek " + Math.sqrt(3));

        double los = Math.random();
        System.out.println("Liczba losowa " + los);
        los = los*100;
        System.out.println("Przeskalowana * 100 " + los);
        los = Math.round(los);
        System.out.println("Zaokraglona " + los);

        int mini = 50, maxi = 100;
        double losowa = (int)(Math.random()*(maxi - mini + 1) + mini);
        System.out.println("Wylosowana liczba to: " + losowa);

        int a = 0; //czerony kapturek
        a+=2; //od babci
        a+=2; //od dziadka
        System.out.println("Liczba a = " + a);
    }
}
