
public class TestTeplomer {

	public static void main(String[] args) {
		LekarskyTeplomer lt = new LekarskyTeplomer();
		System.out.println(lt.odmeraj());	
		System.out.println("naposledy som odmeral " + lt.getPoslednaHodnota());
		for (int i=1; i<10; i++)
		{
			System.out.print("meranie cislo " + i + " teplota je " + lt.odmeraj() + " " );
			lt.infoTeplota();		
		}
	}

}
