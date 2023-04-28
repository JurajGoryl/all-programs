package obchod;

public class Naradie extends Zbozi{

	public int zarucnaDoba;
	public Naradie( String nazov, float cenaBezDPH, int zarucnaDoba) {
		super(nazov, cenaBezDPH);
		this.zarucnaDoba = zarucnaDoba;
	
	}
	public int getZarucnaDoba() {
		return zarucnaDoba;
	}
	public void setZarucnaDoba(int zarucnaDoba) {
		this.zarucnaDoba = zarucnaDoba;
	}
	@Override
	public String getJednotka() {
		return "mesiacov";
	}
}
