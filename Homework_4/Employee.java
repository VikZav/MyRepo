


public class Employee {
	String name;
	deppartment depName;
	int salary;
	
//constructor
	public Employee (String name, deppartment depName, int salary) {
		this.name = name;
		this.depName = depName;
		this.name = name;
	}
	
// enum with departments:	
	static public enum deppartment {
		MARKETING, PR, IT, SALES, PRODUCTION
		}
   //array with 5 objects of class Employee:
	Employee[] arrEmp = {
			new Employee("Ivan", depName.MARKETING, 100),
			new Employee("Nora", depName.SALES, 90),
			new Employee("Mykola", depName.IT, 110),
			new Employee("Huan", depName.PR, 105),
			new Employee("Olga", depName.PRODUCTION, 120)
	};

	
	public static void main (String[] args) {
	

	
		
	}

}

		
	
	


