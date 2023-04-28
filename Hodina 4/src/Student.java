
public class Student {
	public Student(String jmeno, int rocnik)
	{
		this.jmeno=jmeno;
		this.rocnik=rocnik;
	}
	
	public String getJmeno()
	{
		return jmeno;
	}
	
	public int getRocnik()
	{
		return rocnik;
	}
	
	public float getStudijniPrumer() throws StudijniPumnerExcetion {
		if (studijniPrumer == 0) {
			throw new StudijniPumnerExcetion();
		}
		return studijniPrumer;
	}

	public void setStudijniPrumer(float studijniPrumer) throws StudijniPumnerExcetion {
		if (1 <= studijniPrumer && studijniPrumer <= 5) {
			this.studijniPrumer = studijniPrumer;
		}
		else {
		throw new StudijniPumnerExcetion("Studijni prumner musi byt z rozsahu 1 - 5");
		}
		
	}

	private String jmeno;
	private int rocnik;
	private float studijniPrumer;
}