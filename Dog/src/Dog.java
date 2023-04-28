
public class Dog extends Animal {
	
	private int size;	
	protected String name;
	
	public Dog () {
		
	}
	
	
	public Dog (int size, String name) {
		this.size = size;
		this.name = name;
	}
	
	public int getSize() {                         //getery a setery
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}                                             //potialto

	public void bark(int counter) {
		int i = 0;
		while (i < counter){
			switch (this.size / 10) {
				case 0:
					System.out.print("haviiiiiii, ");
					break;
				case 1:
					System.out.print("hav, ");
					break;
				default:
					System.out.print("vrrrr hav,  ");
			}
			i++;
		}
		System.out.println();
		
	}
	
	public final void sitDown () {
		System.out.println(name + " is sitting down");
	}
	public void run () {
		System.out.println(name + " is running (Dog class)");
	}
	
	public void info() {
		System.out.println("my size is " + size);
		System.out.println("my name is " + name);
			
	}
	public void play () {
		System.out.println(name + " is playing");
		
	}

}
