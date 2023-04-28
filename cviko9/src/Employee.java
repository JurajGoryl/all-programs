

public class Employee implements Comparable<Employee>{
	private String nickname;
	private String email;
	private char[] password;
	
	private EmployeeType employeeType;
	
	public EmployeeType getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}
	
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	Employee(String nickname, String email, char[] password, EmployeeType employeeType ){
		this.setEmail(email);
		this.setNickname(nickname);
		this.setPassword(password);
		this.setEmployeeType(employeeType);
		
	}
	public String toString() {
		return "" + nickname + "" + email;
	}
	
	@Override
    public int compareTo(Employee Emp)
    {
        return this.getEmail().compareTo(Emp.getEmail());
    }
    
}
