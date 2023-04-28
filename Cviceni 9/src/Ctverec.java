class Ctverec {

	private float hrana;
	// vypocet obsahu ctverce
	float vypoctiObsah(){					
		return (hrana*hrana);		
	}
	// zjisteni delky hrany ctverce
	float getHrana(){					
		return hrana;
	}
	// nastaveni delky hrany ctverce
	void setHrana(float delka){			
		this.hrana=delka;
	}
	// konstruktor se zadanim delky hrany ctverce
	Ctverec(float hrana){				
		this.hrana=hrana;			
	}
}
