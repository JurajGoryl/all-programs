import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Test {

	public static int pouzeCelaCisla(Scanner sc) 
	{
		int cislo = 0;
		try
		{
			cislo = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}
	


	public static void main(String[] args) throws StudijniPumnerExcetion, IOException {	
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze(1);
		//mojeDatabaze = null;
		int idx;
		float prumer;
		int volba;
		boolean run=true;
		String fileName;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vytvoreni nove databaze");
			System.out.println("2 .. vlozeni noveho studenta");
			System.out.println("3 .. nastaveni prumeru studenta");
			System.out.println("4 .. vypis informace o studentovi");
			System.out.println("5 .. vypis celej databaze");
			System.out.println("6 .. vypis celej databaze do suboru");
			System.out.println("7 .. nacitanie databaze ze suboru");
			System.out.println("-------------------------------------------------");
			System.out.println("8 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			try {
				switch(volba)
				{
					case 1:
						System.out.println("Zadejte pocet studentu");
						try {
							mojeDatabaze=new Databaze(sc.nextInt());
						}
						catch (NegativeArraySizeException e) {
							System.out.println("zadali ste zaporne cislo");
						}
						break;
					case 2:
						mojeDatabaze.setStudent();
						break;
					case 3:
						try {
						System.out.println("Zadejte index a prumer studenta");
						idx=sc.nextInt();
						prumer =sc.nextFloat();
						mojeDatabaze.setPrumer(idx,prumer);
						}
						
						catch(StudijniPumnerExcetion e) {
							System.out.println("Nastala vyjimka typu "+e.toString());
							System.out.println(e.getMessage());	
						}
						break;
					case 4:
						try {
							System.out.println("Zadejte index studenta");
							idx=sc.nextInt();
							Student info=mojeDatabaze.getStudent(idx);
							System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer());
						}
						
							catch(StudijniPumnerExcetion e) {
								System.out.println("Nastala vyjimka typu "+e.toString());
								System.out.println(e.getMessage());	
							}	
						
						break;
					case 5:
						System.out.println("databaza obsahuje: ");
						mojeDatabaze.vypisDatabaze();
						break;
						
					case 6:
						System.out.println("zadejte nazev suboru pre databazi: ");
						fileName = sc.next();
						mojeDatabaze.vypisDatabazeDoSuboru(fileName);
						break;
					
					case 7:
						
						System.out.println("zadejte nazev suboru s databazi: ");
						fileName = sc.next();
						mojeDatabaze.nacitanieDatabaze(fileName);
						
						break;
						
					case 8:
						run=false;
						break;
					
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Nastala vyjimka typu "+e.toString());
				System.out.println("Databaza studentu je plna nebo index studenta neexistuje");
				//sc.next();
			}
			catch(InputMismatchException e) {
				System.out.println("Nastala vyjimka typu "+e.toString());
				System.out.println("zadali ste text prosim zadajte cele cislo");
				sc.next();
				
			}
			catch(NullPointerException e) {
				System.out.println("Nastala vyjimka typu "+e.toString());
				System.out.println("databaza studentov neexistuje najprv ju vytvor (pouzi volbu jedna)");	
			}
			//catch(StudijniPumnerExcetion e) {
			//	System.out.println("Nastala vyjimka typu "+e.toString());
			//	System.out.println(e.getMessage());	
			//}
			
		} 
	}

}
