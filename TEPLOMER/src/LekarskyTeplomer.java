import java.util.Random;

public class LekarskyTeplomer implements TeplomerInterface{
	private float poslednaHodnota;
	@Override
	public float odmeraj() {
		Random rn = new Random();
		float answer = (rn.nextInt(71) + 350)/10.0f;
		System.out.println(answer);
		setPoslednaHodnota(answer);
		return answer;
	}
	public float getPoslednaHodnota() {
		return poslednaHodnota;
	}
	public void setPoslednaHodnota(float poslednaHodnota) {
		this.poslednaHodnota = poslednaHodnota;
	}
	public void infoTeplota() {
		int teplota = (int) poslednaHodnota;
		switch (teplota) {
	    	case 35:
	    		System.out.println("oblec sa");
	    		break;
	    	case 36:
	    		System.out.println("si zdravy jak rybicka");
	    		break;
	    	case 37:
		       System.out.println("napi sa");
		       break;
	    	case 38: case 39:
	  	       System.out.println("daj si paralen");
	  	       break;
	    	case 40: case 41: case 42:
	  	       System.out.println("uz ho vezu");
	  	       break;
		}
	}
	
	
	
}
