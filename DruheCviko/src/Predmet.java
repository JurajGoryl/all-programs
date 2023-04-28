
public abstract class Predmet {
	//1. Metodu, která bude vracet název předmětu
	//2. Metodu, která bude vracet počet bodů získaných v rámci předmětu
	//3. Metodu, která bude informaci, zda splňujete požadavky na udělení zápočtu
	//4. Konstantu udávající minimální počet bodu (15 je minimum) potřebných k udělení zápočtu
	private final int minPoints = 15;
	public abstract String getName();
	public abstract int getPoints();
	public abstract boolean jeZapocet();
	
}
