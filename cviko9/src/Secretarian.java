

public class Secretarian extends Employee {
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	Secretarian(String nickname, String email, char[] password,EmployeeType employeeType, int age ){
		super(nickname, email, password, employeeType);
		this.setAge(age); 
		
	}
	
}
