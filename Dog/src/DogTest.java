import java.util.Scanner;
public class DogTest {

	public static void main(String[] args) {
		BlindDog pes = new BlindDog(20, "Dunco", true);
		Dog orech = new Dog(5, "Oriesok");
		Scanner sc = new Scanner(System.in);
		int i;
		/*
		 * while (false) { System.out.println("zadaj meno psa: ");
		 * pes.setName(sc.nextLine()); System.out.println("zadaj velkost psa: ");
		 * pes.setSize(sc.nextInt());
		 * System.out.println("zadaj kolko krat mam stekat: "); i = sc.nextInt();
		 * System.out.print(pes.getName() + ": "); pes.bark(i);
		 * 
		 * pes.traficLight("red"); }
		 */
		
		pes = null;
		pes.traficLight("red"); 
		orech.info();
		orech.sitDown();
		orech.run();
		pes.info();
		pes.sitDown();
		pes.run();
		
		//Zivocich pes=new Zivocich(5,15);
		//Clovek petr=new Clovek(5,15,true);
		//pes=petr;
		//((Clovek)pes).vypisPohlavi();
		//Clovek karel=(Clovek)pes;
		
		//orech = pes;
		//orech.info();
		if(pes instanceof BlindDog) {
			System.out.println("class slepeky pes");
		}
		pes.play();
		orech.play();

	}

}
