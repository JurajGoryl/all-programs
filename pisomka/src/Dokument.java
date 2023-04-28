

import javax.print.Doc;

public class Dokument {
	
	public void zapisData(String data) throws EmptyData {
		if (data == null) {
			throw new EmptyData();
		}
		System.out.println(data);
		
	}
	public static void main (String[] args) throws EmptyData {
		//Dokument doc = new Dokument();
		
		int a;
		//str = null;
		
		try {
		//doc.zapisData(str);
			a  = 10/0;
		}
			catch (Exception e) {
				System.out.println("e");			
			}
		//}
		//catch (ArithmeticException e) {
			//System.out.println("a");			
		
		catch (RuntimeException e) {
			System.out.println("r");			
		}
		//catch (Exception e) {
			//System.out.println("e");			
		//}
		
		
	}

}
