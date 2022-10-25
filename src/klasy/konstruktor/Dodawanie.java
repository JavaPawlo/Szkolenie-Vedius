package klasy.konstruktor;

import java.security.PublicKey;

public class Dodawanie
{

    private int a;
    private int b;
    private int c;
    private int suma;
    public Dodawanie()
    {
        this(0,0,0); //wywołanie rekursywne konstruktora z 3 parametrami
//        this.a = 0;
//        this.b = 0;
//        this.c = 0; //było tak
    }
    public Dodawanie(int a)
    {
        this(a, 0);  //wywołanie konstruktora z 2 parametrami
        //this.a = a; było tak
     }
    public Dodawanie(int a, int b)
    {
        this(a,b,0); //konstruktor rekursywny
        //this.a = a; było tak
       // this.b = b;
        this.suma = a+b;
    }
    public Dodawanie(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.suma = a+b+c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void suma()
    {
        System.out.println("Suma liczb a "+ a + " i b "+ b +" = "+ (suma));
    }
    public int getSuma()
    {
        return suma;
    }

}
