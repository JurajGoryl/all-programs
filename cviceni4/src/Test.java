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
	
	public static float pouzeCisla(Scanner sc) 
	{
		float cislo = 0;
		try
		{
			cislo = sc.nextFloat();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cislo ");
			sc.nextLine();
			cislo = pouzeCisla(sc);
		}
		return cislo;
	}

	public static void main(String[] args) throws prumerException {	
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze();
		String jmeno;
		float prumer;
		int volba;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vlozeni noveho studenta");
			System.out.println("2 .. nastaveni prumeru studenta");
			System.out.println("3 .. vypis informace o studentovi");
			System.out.println("4 .. vypis jemen studentu");
			System.out.println("5 .. vymazani studenta");
			System.out.println("6 .. zoredenie studentov podla priemeru");
			System.out.println("7 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					mojeDatabaze.setStudent();
					break;
				case 2:
					System.out.println("Zadejte jmeno a prumer studenta");
					jmeno = sc.next();
					prumer = pouzeCisla(sc);
					try
					{
						mojeDatabaze.setPrumer(jmeno,prumer);
					}
					catch (prumerException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:
					System.out.println("Zadejte jmeno studenta");
					jmeno = sc.next();
					Student info = null;
					try 
					{	
						info=mojeDatabaze.getStudent(jmeno);
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer());
					}
					catch (prumerException e)
					{
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer nezadan");
					}
					catch (java.lang.NullPointerException e)
					{
						System.out.format("Student %s neexistuje!\n",jmeno);
					}
					break;
				case 4:
					mojeDatabaze.getJmena();
					break;
				case 5:
					System.out.println("Zadejte jmeno studenta");
					jmeno = sc.next();
					mojeDatabaze.removeStudent(jmeno);
					break;
				case 6:
					mojeDatabaze.seraditStudentyDlePrumeru();
					break;
				case 7:
					run=false;
					break;
				
			}
			
		}
	}

}
