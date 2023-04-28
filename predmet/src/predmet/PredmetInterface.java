package predmet;

public abstract class PredmetInterface {
    public static final int minPointsZapocet = 15;  
    // public static final je default pre interface cize je to konstanta nemusim to pisat
    public String getName();  //mozno vstup name??? uvidime (String n)
    public int getPoints();
    public void infoZapocet();
}