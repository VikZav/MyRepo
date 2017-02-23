package Employee_task;

public class ContractEmployee extends Employee implements CalcPay{

//total worked hours;	
	int wHours;
//is he member of FederalTax ?
	boolean federalTaxIdmember;

//constructor	
	public ContractEmployee(String employeeId, String name, int wHours, boolean federalTaxIdmember) {
		super.employeeId=employeeId;
		super.name=name;
		this.wHours=wHours;
		this.federalTaxIdmember=federalTaxIdmember;
	}
	
//@Override toString:
	public String toString() {
		return ("ID:"+employeeId+", employers name: "+name+",");
	}
	
	
	
// override interface method:	
	@Override
	public int calculatePay() {
		int averageSal;
		int hourlyRate=8;
		
		return averageSal=hourlyRate*wHours;
	}
	
}
