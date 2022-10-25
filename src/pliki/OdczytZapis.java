package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OdczytZapis {
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintWriter zapis = new PrintWriter("ala.txt");
        zapis.println("Ala ma kota a kot ma asdasdasdale");
        zapis.println("Nowa linia");
        zapis.close();

        File plik = new File("ala.txt");
        Scanner in = new Scanner(plik);
        String zadanie = in.nextLine();
        System.out.println("Zdanie "+ zadanie);
    }
}
