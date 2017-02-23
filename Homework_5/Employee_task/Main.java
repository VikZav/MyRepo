package Employee_task;
import java.util.Comparator;

class Main {

	public static void main(String[] args) {
		
	Employee Empl [] = {
		new ContractEmployee ("c014k","Michael", 40, true),
		new SalariedEmployee ("v125l", "Mora", 400, "123-45-6789"),
		new ContractEmployee ("b236o", "Serg", 55, true),
		new SalariedEmployee("n347i", "Lora", 410, "987-65-4321")
			
	};
		

//
	
	
	for (int i = 0; i < Empl.length; i++) {
		
		System.out.println(Empl[i].toString()+" monthly wage: "+((CalcPay)Empl[i]).calculatePay());
		
		
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		

	}

	}
}
