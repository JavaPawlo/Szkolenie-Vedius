package klasy.interfejsy;

public interface Poruszanie {
    int  a =9;  //statyczne i finalne
    public String wLewo();
    public String wPrawo();
    public default String prosto()
    {
        return "Idz prosto";
    }
}
