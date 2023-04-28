
public class Test {

	public static void main(String[] args) {
		PredmetOne p1 = new PredmetOne();
		p1.setName("BPC1");
		System.out.println(p1.getName());
		p1.setPoints(15);
		System.out.println(p1.getPoints());
		System.out.println(p1.jeZapocet());
		p1.addPointsZapocet(2);
		System.out.println(p1.getPoints());
		p1.addPointsSkuska(70);
		System.out.println(p1.getPoints());

	}

}
