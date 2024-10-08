package cviko4;

public class List {

	private Rtp prva;
	
	public void addPrvni(int hod) {
		Rtp a = new Rtp(hod);
		a.setNext(prva);
		prva=a;
	}
	
	public void setPrvni (Rtp aktualna) {
		aktualna.setNext(prva);
		prva=aktualna;
	}
	public boolean jePrazdna() {
		
		// return prva == null;
		
		if (prva == null) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	public void mazemPrvni() {
		prva = prva.getNext();
		
	}
	
	public boolean hladamCislo(int cislo) {
		Rtp aktualna = prva;
		while (aktualna!=null) {
			if (aktualna.getVal()==cislo) {
				return true;
			}
		aktualna=aktualna.getNext();
		}
	return false;
	}
	
	
}
