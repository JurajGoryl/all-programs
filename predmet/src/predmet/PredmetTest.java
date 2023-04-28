package predmet;

public class PredmetTest {
    public static void main(String[] args)  {
        PredmetOne p1 = new PredmetOne();
        PredmetTwo p2 = new PredmetTwo();
        System.out.println("Predmet: " + p1.getName());
        p1.infoZapocet();
        p1.addPoints(10);
        p1.infoZapocet();
        p1.addPoints(15);
        p1.infoZapocet();

        
        p1.addPointsSkuska(70);
        p1.infoSkuska();
        p1.addPointsSkuska(90);
        p1.infoSkuska();

        System.out.println("Predmet: " + p2.getName());
        p2.infoProject();
        p2.addPointsProject(15);
        p2.infoProject();
        p2.addPointsProject(80);
        p2.infoProject();

        p2.infoPolSemSkuska();
        p2.addPointsPolSemSkuska(10);
        p2.infoPolSemSkuska();
        p2.addPointsPolSemSkuska(40);
        p2.infoPolSemSkuska();
        
        p2.infoZaverecnaSkuska();
        p2.addPointsZaverecnaSkuska(10);
        p2.infoZaverecnaSkuska();
        p2.addPointsZaverecnaSkuska(60);
        p2.infoZaverecnaSkuska();


    }
    
}