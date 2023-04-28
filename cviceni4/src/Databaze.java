import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Databaze {
	private Scanner sc;
	private HashMap<String, Student> prvkyDatabaze;
	Databaze()
	{
		sc=new Scanner(System.in);
		prvkyDatabaze = new HashMap<String, Student>();
	}
	
	public void setStudent()
	{
		System.out.println("Zadejte jmeno studenta, rok narozeni");
		String jmeno=sc.next();
		int rok=Test.pouzeCelaCisla(sc);
		if (true != prvkyDatabaze.containsKey(jmeno)) {
			prvkyDatabaze.put(jmeno, new Student(jmeno,rok));
		}
		else {
			System.out.format("Student %s uz existuje!\n",jmeno);
		}
	}
	
	public Student getStudent(String jmeno) 
	{
		return prvkyDatabaze.get(jmeno);
	}
	
	public boolean setPrumer(String jmeno, float prumer) throws prumerException
	{
		if (prvkyDatabaze.containsKey(jmeno)) {
			prvkyDatabaze.get(jmeno).setStudijniPrumer(prumer);	
			return true;
		}	
		else { 
			System.out.format("Student %s neexistuje!\n",jmeno);
			return false;
		}
		
	}
	public void getJmena(){
		System.out.println( prvkyDatabaze.keySet());
		
	}
	public void removeStudent(String jmeno) {
		if (prvkyDatabaze.containsKey(jmeno)) {
			prvkyDatabaze.remove(jmeno);
			System.out.format("Student %s vymazan!\n",jmeno);
		}
			
		else { 
			System.out.format("Student %s neexistuje!\n",jmeno);
		
		}
	}
	    public void seraditStudentyDlePrumeru() throws prumerException {
	        List<Student> seznamStudentu = new ArrayList<>(prvkyDatabaze.values());
	        Collections.sort(seznamStudentu, new Comparator<Student>() {
	            @Override
	            public int compare(Student s1, Student s2) {
	                try {
						return Float.compare(s1.getStudijniPrumer(), s2.getStudijniPrumer());
					} catch (prumerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return 0;
	            }
	        });

	        System.out.println("Seznam studentu serazen dle prumeru:");
	        for (Student student : seznamStudentu) {
	            
					System.out.println("Jmeno: " + student.getJmeno() + ", prumer: " + student.getStudijniPrumer());
				
	        }
	    }

		
	}
	
