import java.io.BufferedReader;
import java.util.HashMap;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Databaze {
	private Scanner sc;
	private Student [] prvkyDatabaze;
	private int posledniStudent;
	public Databaze(int pocetPrvku)
	{
		prvkyDatabaze=new Student[pocetPrvku];
		sc=new Scanner(System.in);
	}
	
	public void setStudent()
	{
		System.out.println("Zadejte jmeno studenta, rok narozeni");
		String jmeno=sc.next();
		int rok=sc.nextInt();
		prvkyDatabaze[posledniStudent++]=new Student(jmeno,rok);
	}
	
	public Student getStudent(int idx)
	{
		return prvkyDatabaze[idx];
	}
	
	public void setPrumer(int idx, float prumer) throws StudijniPumnerExcetion
	{
		prvkyDatabaze[idx].setStudijniPrumer(prumer);
	}
	public void vypisDatabaze() throws StudijniPumnerExcetion{
		for(Student st : prvkyDatabaze) {
			System.out.format("Jmeno: %s, rok narozeni: %d, studijni prumer: %2.1f \n", st.getJmeno(), st.getRocnik(), st.getStudijniPrumer());
		}
	}
	public void vypisDatabazeDoSuboru(String fileName) throws IOException, StudijniPumnerExcetion {
		FileWriter fw = new FileWriter(fileName);
		
		String line = String.format("%d\n",prvkyDatabaze.length);
		fw.write(line);
		fw.flush();
		for(Student st : prvkyDatabaze) {
			line = String.format("%s;%d;%2.1f\n", st.getJmeno(), st.getRocnik(), st.getStudijniPrumer());
			fw.write(line);
			fw.flush();
		}
		
		
		fw.close();
	}
	public void nacitanieDatabaze(String fileName) throws IOException, NumberFormatException, StudijniPumnerExcetion {
		//String celyText = "";
		FileReader fr = null;
		BufferedReader in = null;
		 try {
			fr = new FileReader(fileName);
			in = new BufferedReader(fr);
			String radek;
			radek = in.readLine();
			System.out.println(radek);
			prvkyDatabaze = null;
			prvkyDatabaze=new Student[Integer.parseInt(radek)];
			System.out.println("subor ma: " + prvkyDatabaze.length + " studentov");
			posledniStudent = 0;
			while ((radek = in.readLine()) != null) {
				String[] sections = radek.split(";");
				System.out.format("Jmeno: %s, rok narozeni: %s, studijni prumer: %s \n", sections[0], sections[1], sections[2]);
				prvkyDatabaze[posledniStudent]=new Student(sections[0],Integer.parseInt(sections[1]));
				prvkyDatabaze[posledniStudent].setStudijniPrumer(Float.parseFloat(sections[2]));
				posledniStudent++;
			}
		 }
		 catch (IOException e) {
			 
		 }
		 /*
		
		
		while ((radek = in.readLine()) != null) {
			System.out.println(".řádek: " + radek);
			celyText = new String(celyText + radek + "\n");
		}
		System.out.print("\n*** Výpis celého textu ***\n"+celyText); 
	        } catch c {
		System.out.println("Soubor  nelze otevřít");
		*/  
	 finally { 
		in.close(); fr.close(); // nutno doimplementovat null check atd.
	}
	


		/*String line; // Put the line in here however you're reading from the file.
		String[] sections = line.split(";");
		// Assuming you know there are always two sections, names and addresses:
		String[] names = sections[0].split(",");
		String[] addresses = sections[1].split(",");

		// Convert arrays into ArrayLists if you actually need to
		List<String> namesList = new ArrayList<>( Arrays.asList( names ) );
		List<String> addressList = new ArrayList<>( Arrays.asList( addresses ) );*/
	}
	
	
}