package obchod;

public abstract class Zbozi {
	public String nazov;
	public  float cenaBezDPH;
	public static float DPH = 0.21f;
	
	public Zbozi(String nazov, float cenaBezDPH) {
		this.nazov = nazov;
		this.cenaBezDPH = cenaBezDPH;
	}
	
	public String getNazov() {
		return nazov;
	}
	public void setNazov(String nazov) {
		this.nazov = nazov;
	}
	public float getCena() {
		return cenaBezDPH * (DPH + 1);
	}
	public void setCenaBezDPH(float cenaBezDPH) {
		this.cenaBezDPH = cenaBezDPH;
	} 
	
	public abstract String getJednotka();
}
