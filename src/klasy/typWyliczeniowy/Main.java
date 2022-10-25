package klasy.typWyliczeniowy;

public class Main {
    public static void main(String[] args) {
        DniTygodnia poniedziałek = DniTygodnia.PONIEDIZAŁEK;
        for(DniTygodnia dzien: DniTygodnia.values())
        {
            System.out.println(dzien.toString());
        }
    }
}
