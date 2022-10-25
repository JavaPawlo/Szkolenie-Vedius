package klasy.dziedziczenie;

import klasy.NadpisywanieMetod;

import java.lang.constant.Constable;

public class Samochod extends Pojazd {


    int moc = 90;
    double pojemnoscSilnika = 1.9;
    String marka ="nieznana";
    int iloscDrzwi = 5;
    Samochod()
    {
        this.kola = 4;
        this.moc = 50;
        this.pojemnoscSilnika = 1.0;
        this.iloscDrzwi = 5;
        this.marka = "nieznana";
    }
    Samochod(int kola, int moc, double pojemnoscSilnika, String marka, int iloscDrzwi)
    {
        this.kola = kola;
        this.moc = moc;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.marka= marka;
        this.iloscDrzwi= iloscDrzwi;
    }
    Samochod(int kola, String kolor, boolean czyDziala, int moc, double pojemnoscSilnika, String marka, int iloscDrzwi)
    {
        super(kola, kolor, czyDziala);
//        this.kola = kola;
//        this.kolor = kolor;
//        this.czyDziala = czyDziala;
        this.moc = moc;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.marka= marka;
        this.iloscDrzwi= iloscDrzwi;
    }

    @Override
    public String toString() {
        return super.toString() + "\n, marka: " + marka + ", ilość drzwi: " + iloscDrzwi + "pojemnosc silnika: "
                + pojemnoscSilnika + ", moc: " + moc;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(", marka: " + marka + ", ilość drzwi: " + iloscDrzwi + "pojemnosc silnika: "
                + pojemnoscSilnika + ", moc: " + moc);
    }
}