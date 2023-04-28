package obchod;

public class Test {

	public static void main(String[] args) {
		Zbozi[] regal = new Zbozi[4];
		regal[0] = new Potravina("Rohlik",1.5f, 1);
		regal[1] = new Naradie("Kleste",278.0f, 24);
		regal[2] = new Potravina("Chleba",28.8f, 6);
		regal[3] = new Potravina("Jablko",51.0f, 20);
	
		for (int i = 0; i<4; i++){
			System.out.format("%s, cena: %5.2f", regal[i].getNazov(), regal[i].getCena());
			
			if (regal[i] instanceof Potravina)
				System.out.format(", trvanlivost: %d %s \n",((Potravina)regal[i]).getTrvanlivost(), regal[i].getJednotka());
			else
				System.out.println();
			
				
		}
	}
}
