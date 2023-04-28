package predmet;

public class PredmetOne extends PredmetInterface {
    public static final int minPointsZapocet = 15;
    public static final int maxPointsZapocet = 20;
    public static final int maxPointsSkuska = 80;
    private String name = "BPC1";
    private int points;
    private int pointsSkuska;

    public String getName() {
        return name;
    };

    public int getPoints() {
        return points;
    };

    public void addPoints(int p) {
        points = points + p;
        if (points > maxPointsZapocet) {
            points = maxPointsZapocet;
        }
    }

    public void addPointsSkuska(int p) {
        pointsSkuska =  p;
        if (pointsSkuska > maxPointsSkuska) {
            pointsSkuska = maxPointsSkuska;
        }
    }

    public void infoZapocet() {
        String text = "nesplnene";
        if (points >= minPointsZapocet) {
            text = "splneno";
        }
        System.out.println("Zapocet info: Body(" + points + ") " + text);
    };

    public void infoSkuska() {
        System.out.println("Skuska info: Body(" + pointsSkuska + ") " );
    };
    
    public int getPointsSkuska() {
        return pointsSkuska;
    }

    
    public void setPointsSkuska(int pointsSkuska) {
        this.pointsSkuska = pointsSkuska;
    }

}
