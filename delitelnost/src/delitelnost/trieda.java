package delitelnost;
import java.util.Scanner;

public class trieda 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
boolean jeprvocislo = true;
long i;
	System.out.println("zadaj číslo");
	Scanner sc = new Scanner(System.in);
	boolean jecislo = sc.hasNextLong();
	//System.out.println(jecislo);
	long cislo = sc.nextLong();
	System.out.print("delitele: ");
	for(i=2;i<cislo/2+1;i++)
	{
		long zvysok = cislo % i;
				if (zvysok == 0 ) 
				{
					jeprvocislo = false;
					//String jenie = " nie"; 
					System.out.print(i+", ");
				}
	
	}
	System.out.println(" ");
	System.out.println("číslo " + cislo + " je prvočíslo: " + jeprvocislo);
	System.out.println(i);
	
	
	
	}
}
