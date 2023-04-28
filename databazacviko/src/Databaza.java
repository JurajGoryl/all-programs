
public class Databaza {

	String meno;
	int vek;
	double uvazok;
	static double maxUvazok = 1;
	
	public static void main(String[] args) {
		Databaza db = new Databaza("Marian", 48);                  //inicializacia obektu triedy databaza
		db.pozdravSa();
		db.setVek(21);
		db.setMeno("Juraj");
		db.setUvazok(1);
		db.pozdravSa();
		System.out.println(db.maxUvazok);
		Databaza.setMaxUvazok(1000);
		System.out.println(db.maxUvazok);
		System.out.println(db.addUvazok(100));
		db.pozdravSa();
		System.out.println(db.addUvazok(1000));
		db.pozdravSa();
		
	}
	
	Databaza(String meno, int vek){
		this.meno = meno;
		this.vek = vek;
	}
	
	public void setMeno(String meno) {
		this.meno = meno;
	}
	
	public void setVek(int vek) {
		this.vek = vek;
	}
	
	public void setUvazok(double uvazok) {
		this.uvazok = uvazok;
	}
	
	public String getMeno() {
		return this.meno;
	}
	
	public int getVek() {
		return this.vek;
	}
	
	public double getUvazok() {
		return this.uvazok;
	}
	
	public void pozdravSa() {
		System.out.println("Ahoj volam sa: " + meno + ", moj vek je: " + vek + ", moj uvazok je:  " + uvazok);
	}
	
	public static void setMaxUvazok(double maxU) {
		maxUvazok = maxU;
	}
	public boolean addUvazok (double uvazok) {
		if (uvazok + getUvazok() < maxUvazok) {
			
			setUvazok(getUvazok() + uvazok);
			return true;
		}
		else {
			return false;
		}
		
	}
	
}


