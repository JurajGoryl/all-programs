
import java.util.Scanner;

public class DatabaseOperation {
	
	public static void main(String[] args) {
		Databaza [] poleDatabaza = new Databaza[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<poleDatabaza.length;i++)
		{ 
			System.out.println(i);
			System.out.println("zadaj meno: ");
			String meno = sc.next();
			
			System.out.println("zadaj vek: ");
			int vek = sc.nextInt();
			poleDatabaza[i]=new Databaza(meno, vek);               //konstruktor
			poleDatabaza[i].pozdravSa();
		}
		System.out.println("Zadaj maximalny uvazok: ");
		double maxUvazokInp = sc.nextDouble();
		
		while (true) {
			System.out.println("zadaj index osoby: ");
			int index = sc.nextInt();
			poleDatabaza[index].pozdravSa();
			
			System.out.println("zadaj novy uvazek: ");
			double novyUvazek = sc.nextDouble();
			System.out.println(poleDatabaza[index].addUvazok(novyUvazek));
			poleDatabaza[index].pozdravSa();
		}
	}

}
