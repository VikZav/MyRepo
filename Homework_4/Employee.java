import java.util.Scanner;

public class Employee {
	String name;
	Deppartment depName;
	int salary;
	
//constructor
	public Employee (String name, Deppartment depName, int salary) {
		this.name = name;
		this.depName = depName;
		this.salary = salary;
	}
	
// enum with departments:	
	 public enum Deppartment {
		MARKETING, PR, IT, SALES, PRODUCTION
		} 

// Display worker name by departmetn:	 
	 String workName;
	 public String getName (String wName) {
		switch (wName) {
		case "Marketing": {
		workName="Ivan";
		break;
		}
		case "Sales": {
		workName="Nora";
		break;
		}
		case "IT": {
		workName="Mykola";
		break;
		} 
		case "PR": {
		workName="Huan";
		break;
		} 
		case "Production": {
		workName="Olga";
		break;
		} 
		default:
			System.out.println("Not a valid worker name");
		}
	 
		 return workName;
 }
	 
	 
	 
     //array with 5 objects of class Employee:
	 static	 Employee arrEmp [] = {
			new Employee("Ivan",Deppartment.MARKETING, 100),
			new Employee("Nora", Deppartment.SALES, 90),
			new Employee("Mykola", Deppartment.IT, 110),
			new Employee("Huan", Deppartment.PR, 105),
			new Employee("Olga", Deppartment.PRODUCTION, 120)
	};

	 
//Override toString method:	 
	 @Override
	 public String toString() {
 	return "Employee name="+name+", Deppartment="+depName+", Salary="+salary;
	 }		
	 
// Arrange workers by salary in ascending order: 	 
	
	 
	 
	 
	 
	 
// main method:
	public static void main (String[] args) {

//Input department to get worker:		
		Scanner sc = new Scanner(System.in);
		String dName;
		System.out.println("Enter the name of a department:");
		dName = sc.nextLine();
		
// Instantiate first worker: 		
		Employee empl1 = new Employee (arrEmp[0].name, arrEmp[0].depName, arrEmp[0].salary);
		
//Display workers name:		
		System.out.println("Worker of "+dName+" department is "+empl1.getName(dName)+".");
	
// Arrange workers by salary in ascending order: 	 	
		System.out.println("\n"+"Aranged workers by salary in ascending order:");
		int tmp;
		for (int i = 0; i < arrEmp.length - 1; i++) {
			for (int j = i + 1; j < arrEmp.length; j++) {
				if (arrEmp[i].salary > arrEmp[j].salary) {
					tmp = arrEmp[i].salary;
					arrEmp[i].salary = arrEmp[j].salary;
					arrEmp[j].salary = tmp;
				}
			}
		}
		for (int i = 0; i < arrEmp.length; i++) {
			System.out.println(arrEmp[i].toString());
		}
		
		
// Arrange workers by salary in ascending order:	
		System.out.println("\n"+"Aranged workers by salary in descending order:");
		int tmp2;
		for (int i = 0; i < arrEmp.length - 1; i++) {
			for (int j = i + 1; j < arrEmp.length; j++) {
				if (arrEmp[i].salary < arrEmp[j].salary) {
					tmp2 = arrEmp[i].salary;
					arrEmp[i].salary = arrEmp[j].salary;
					arrEmp[j].salary = tmp2;
				}
			}
		}
		for (int i = 0; i < arrEmp.length; i++) {
			System.out.println(arrEmp[i].toString());
		}
	
	
	
	
	}


	
	}

















		
	
	


