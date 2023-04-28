
public class PredmetOne extends Predmet{
	private String name;
	private int points;
	private final int minPoints = 15;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public boolean jeZapocet() {
		if ( this.points >= minPoints) {
			return true;
		}
		return false;
	} 
	
	public void addPointsZapocet(int p) {
		if ((points + p) < 20) {
			points += p;
		}
	}
	public void addPointsSkuska(int p) {
		if (p <= 80) {
			points += p;
		}
	}
}
