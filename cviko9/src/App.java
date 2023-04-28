

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.crypto.spec.SecretKeySpec;

public class App {

	public static void main(String[] args) {
		String a = "jozo123";
		Employee employee1 = new Employee( "jozo ", "jozo@vut.cz",a.toCharArray(), EmployeeType.valueOf("ACTIVE"));
		a = "fero123";
		Employee employee2 = new Employee("fero ", "fero@vut.cz",a.toCharArray(), EmployeeType.valueOf("ACTIVE"));
		a = "milan123";
		Employee employee3 = new Employee("milan ", "milan@vut.cz",a.toCharArray(), EmployeeType.valueOf("ACTIVE"));
		a = "jan123";
		Employee employee4 = new Employee("jan ", "jan@vut.cz",a.toCharArray(), EmployeeType.valueOf("ACTIVE"));
		a = "ignac123";
		Employee employee5 = new Employee("ignac ", "ignac@vut.cz",a.toCharArray(), EmployeeType.valueOf("ACTIVE"));
		a = "jana123";
		Secretarian secretarian1 = new Secretarian( "Lea ", "lea@vut.cz",a.toCharArray(), EmployeeType.valueOf("ACTIVE"), 25);
		a = "boza123";
		Secretarian secretarian2 = new Secretarian("boza ", "boza@vut.cz",a.toCharArray(), EmployeeType.valueOf("ACTIVE"), 30);
		a = "boss123";
		List<Employee> myListEmployee = new ArrayList<>();
		myListEmployee.add(employee1);
		myListEmployee.add(employee2);
		myListEmployee.add(employee3);
		myListEmployee.add(employee4);
		myListEmployee.add(employee5);
		myListEmployee.add(secretarian1);
		myListEmployee.add(secretarian2);
		List<Secretarian>myListSecretarian = new ArrayList<>(); 
		myListSecretarian.add(secretarian1);
		Manager manager1 = new Manager("boss ", "boss@vut.cz",a.toCharArray(), EmployeeType.valueOf("ACTIVE"),myListEmployee, myListSecretarian);
		
		List<Employee> Employees = manager1.getListOfEmployees();
        Collections.sort(Employees);
		
		System.out.println("ahoj ja som  " + manager1);
		System.out.println("toto su moji zamenstnanci " + manager1.getListOfEmployees());
		System.out.println("mam vztah s " + manager1.getListOfRelationship());
		
		byte age = 4;
        
        Cat c = new Cat(age);
        Dog d = new Dog(age);
        Pig i = new Pig(age);
        Cow w = new Cow(age);
        Goat g = new Goat(age);

        c.sound();
        d.sound();
        i.sound();
        w.sound();
        g.sound();
        
        System.out.println();
        
        CatImpl cat = new CatImpl(age);
        DogImpl dog = new DogImpl(age);
        PigImpl pig = new PigImpl(age);
        CowImpl cow = new CowImpl(age);
        GoatImpl goat = new GoatImpl(age);

        cat.sound();
        cat.toFile();
        dog.sound();
        dog.toFile();
        pig.sound();
        pig.toFile();
        cow.sound();
        cow.toFile();
        goat.sound();
        goat.toFile();
		
	}

}
