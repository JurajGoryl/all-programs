
public class BlindDog extends Dog {
	
	private boolean readyTF;
	
	public BlindDog (int size, String name, boolean readyTF) {
		super(size, name);
		this.readyTF = readyTF;
	}
	
	public boolean getReadyTF() {
		return readyTF;
	}

	public void setReadyTF(boolean readyTF) {
		this.readyTF = readyTF;
	}
	
	

	public void traficLight (String color) {
		
		System.out.print("traffic light is "+ color + " " + name + " is saying ");
		
		switch (color) {
		
		case "green":
			System.out.println("go");
			break;
			
		case "red":
			System.out.println("stop");
			bark(1);
			break;
		}
	}
	
	public void info() {
		super.info();
		System.out.println("I am trained " + readyTF);
			
	}
	@Override
	public void run () {
		System.out.println(name + " is running (BlindDog class)");
	}
	
}
