
import java.util.List;


public class Manager<T> extends Employee {
	
	private List<Employee> listOfEmployees;
	private List<T> listOfRelationship;
	
	Manager(String nickname, String email, char[] password, EmployeeType employeeType, List<Employee> listOfEmployees, List<T> listOfRelationship) {
		super(nickname, email, password, employeeType);
		this.setListOfEmployees(listOfEmployees);
		this.listOfRelationship = listOfRelationship;
		
	}
	public List<Employee> getListOfEmployees() {
		return listOfEmployees;
	}
	public void setListOfEmployees(List<Employee> listOfEmployees) {
		this.listOfEmployees = listOfEmployees;
	}
	public List<T> getListOfRelationship() {
		return listOfRelationship;
	}
	public void setListOfRelationship(List<T> listOfRelationship) {
		this.listOfRelationship = listOfRelationship;
	}
	
}
