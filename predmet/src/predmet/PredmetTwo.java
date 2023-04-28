package predmet;

public class PredmetTwo extends PredmetInterface {
    public static final int minPointsZapocet = 15;
    public static final int maxPointsZapocet = 20;
    public static final int maxPointsSkuska = 50;
    public static final int maxPointsProject = 30;
    public static final int maxPointsPolSemSkuska = 20;
    public static final int maxPointsZaverecnaSkuska = 50;
    private String name = "BPC2";
    private int points;
    private int pointsSkuska;
    private int pointsProject;
    private int pointsPolSemSkuska;
    private int pointsZaverecnaSkuska;

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
        pointsSkuska = p;
        if (pointsSkuska > maxPointsSkuska) {
            pointsSkuska = maxPointsSkuska;
        }
    }

    public void addPointsProject(int p) {
        pointsProject = p;
        if (pointsProject > maxPointsProject) {
            pointsProject = maxPointsProject;
        }
    }

    public void addPointsPolSemSkuska(int p) {
        pointsPolSemSkuska = p;
        if (pointsPolSemSkuska > maxPointsPolSemSkuska) {
            pointsPolSemSkuska = maxPointsPolSemSkuska;
        }
    }

    public void addPointsZaverecnaSkuska(int p) {
        pointsZaverecnaSkuska = p;
        if (pointsZaverecnaSkuska > maxPointsZaverecnaSkuska) {
            pointsZaverecnaSkuska = maxPointsZaverecnaSkuska;
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
        System.out.println("Skuska info: Body(" + pointsSkuska + ") ");
    };

    public void infoProject() {
        System.out.println("Project info: Body(" + pointsProject + ") ");
    };

    public void infoPolSemSkuska() {
        System.out.println("Polsemestralna skuska info: Body(" + pointsPolSemSkuska + ") ");
    };

    public void infoZaverecnaSkuska() {
        System.out.println("zaverecna skuska info: Body(" + pointsZaverecnaSkuska + ") ");
    };

    public int getPointsSkuska() {
        return pointsSkuska;
    }

    public void setPointsSkuska(int pointsSkuska) {
        this.pointsSkuska = pointsSkuska;
    }

    public int getPointsProject() {
        return pointsProject;
    }

    public void setPointsProject(int pointsProject) {
        this.pointsProject = pointsProject;
    }

    public int getPointsPolSemSkuska() {
        return pointsPolSemSkuska;
    }

    public void setPointsPolSemSkuska(int pointsPolSemSkuska) {
        this.pointsPolSemSkuska = pointsPolSemSkuska;
    }

    public int getPointsZaverecnaSkuska() {
        return pointsZaverecnaSkuska;
    }

    public void setPointsZaverecnaSkuska(int pointsZaverecnaSkuska) {
        this.pointsZaverecnaSkuska = pointsZaverecnaSkuska;
    }

}
