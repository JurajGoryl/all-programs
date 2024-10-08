package cviko4;

import java.io.Console;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;


public class Executable {

	public static void main(String[] args) {
		
		Citac c1 = new Citac();
		c1.citam();
	
		  List l1 = new List();
		  l1.addPrvni(1);
		  l1.addPrvni(2);
		  l1.addPrvni(3);
		  
	        Rtp p1 = new Rtp(1);
	        l1.setPrvni(p1);
	        Rtp p2 = new Rtp(2);
	        l1.setPrvni(p2);
	        Rtp p3 = new Rtp(3);
	        l1.setPrvni(p3);
	        Rtp prez4 = new Rtp(4);
	        l1.setPrvni(prez4);
	        Rtp p5 = new Rtp(5);
	        l1.setPrvni(p5);
	        
	        System.out.println("je prazdna? " + l1.jePrazdna());
	        System.out.println("je tam 4? " + l1.hladamCislo(4));
	        System.out.println("je tam 5? " + l1.hladamCislo(5));
		
	}

}
