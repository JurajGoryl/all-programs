package predmetnacviku;

public class PIS implements Predmet{
	boolean zapocet;
	@Override
	public String getName() {
		
		return null;
	}
	@Override
	public int getPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean infoZapocet() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public boolean zadajZapocet() {
		if (zapocet == true) {
			return zapocet;
		}
	}
}
