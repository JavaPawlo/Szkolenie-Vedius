package szkoleniePodstawowe;

public class Suma20LiczbOdSto {

    //program liczby sumę 20 liczb parzystych począwszy od 100.
    public static void main(String[] args) {
        int suma = 0;
        int parzysta = 100;
        for (int i = 0; i < 20; i++) {
            suma = suma + parzysta;
            parzysta += 2;
            System.out.println("chwilowa suma to " + suma);
        }
        System.out.println("koncowa suma to: " + suma);

        //suma 20 liczb parzystych loswych z przedziału od 100 do 200
        int sumap = 0;
        int losp = 0;
        int parzystap =0;
        while (parzystap < 2)
        {
            losp = (int)(Math.random()*(100+1)+100);
            if(losp%2 == 0)
            {
                System.out.println("lp " + parzystap +"Parzysta " + losp);
                parzystap++;
                sumap = sumap + losp;
            }
        }
        System.out.println("Suma liczb: " + sumap);
    }
}
