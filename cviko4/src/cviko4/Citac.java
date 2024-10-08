package cviko4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Citac {

	
	public void citam()  {
		
		try {
		File subor = new File("C:\\Users\\Student\\Downloads\\jurajko.txt");
		Scanner scanner = new Scanner(subor);
		HashMap<String,Integer> pocetSlov = new HashMap<>();
		
		while (scanner.hasNext()) {
			String slovo = scanner.next();
			if (pocetSlov.containsKey(slovo)) {
				int act = pocetSlov.get(slovo);
				act++;
				pocetSlov.put(slovo, act);
			}
			else {
				pocetSlov.put(slovo, 1);
			}
		}
		
		System.out.println(pocetSlov);
		
		} catch (FileNotFoundException err){
			System.out.println(err);
			err.printStackTrace();
		}
	}
}
