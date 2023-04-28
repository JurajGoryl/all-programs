package obchod;

public class Potravina extends Zbozi{

	public int trvanlivost;
	
	public Potravina(String nazov, float cenaBezDPH) {
		super(nazov, cenaBezDPH);
		// TODO Auto-generated constructor stub
	}
	
	public Potravina(String nazov, float cenaBezDPH, int trvanlivost){
		super(nazov, cenaBezDPH);
		this.trvanlivost = trvanlivost;
	}
	
	@Override
	public String getJednotka() {
		return "dnú";
	}

	public int getTrvanlivost() {
		return trvanlivost;
	}

	public void setTrvanlivost(int trvanlivost) {
		this.trvanlivost = trvanlivost;
	}
	
	

}
