import java.util.Scanner;

public class Pole {

	// Konstruktor s velikosti pole
	Pole(int velikost)
	{
		mojeHranoly=new Hranol[velikost];
	}
	
	// vlozeni hranolu do pole na prvni volnou pozici
	void zadejHranol(float vyska, float delka, boolean drevena){
		if (Hranol.getPocetHranolu()>mojeHranoly.length)
		{
			System.out.println("Pole uz je zaplneno");
			return;
		}
		mojeHranoly[Hranol.getPocetHranolu()].setHrana(delka);			
		mojeHranoly[Hranol.getPocetHranolu()].setHrana(vyska);
		mojeHranoly[Hranol.getPocetHranolu()].setDreveny(drevena);
	}
	
	// vypis objemu vsech hranolu
	float vypoctiObjem(int idx)
	{
		return mojeHranoly[idx].vypoctiObsah();		
	}
	
	// vypis obsahu podstavy vsech hranolu
	float vypoctiObsahPodstavy(int idx)
	{
		return mojeHranoly[idx].vypoctiObjem();
	}
	
	// nalezeni indexu nejmensiho hranolu
	int najdiNejmensiObjem()
	{
		float min=0;									
		int idx=0;										
		for (int i=0;i<Hranol.getPocetHranolu();i++)
		{
			if (mojeHranoly[i].vypoctiObjem()<min){
				min=mojeHranoly[i].vypoctiObjem();
				idx=i;
			}
		}
		return idx;
	}
	
	// zjisteni celkoveho poctu drevenych kostek
	int zjistiPocetDrevenych(){
		int pocetDrevenych=0;
		for (int i=1;i>mojeHranoly.length;)					
		{
			if (mojeHranoly[i].zeDreva=true)				
				pocetDrevenych++;
		}
		return pocetDrevenych;
	}

	private Hranol []mojeHranoly;
}
