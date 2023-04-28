package predmetnacviku;

public class BPC1 implements Predmet{
	private int pocetBodu;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean infoZapocet() {
		if (pocetBodu > minPointsZapocet) {
			return true;
		}
		return false;
	}
	public boolean aktivitaCvika(int points) {
		if (points < 0 || points > 20)
			return false;
		pocetBodu += points;
		return true;
	}
	
	public boolean zadajSkusku(int points) {
		if (points < 0 || points > 80)
			return false;
		pocetBodu += points;
		return true;
	}

}
