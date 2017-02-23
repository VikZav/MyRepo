package Employee_task;

class SalariedEmployee extends Employee implements CalcPay {

//fixed monthly payment:	
	int monthPay;
//Social Security Number of this employee:	
	String socialSecurityNumber ;

//constructor:	
	public SalariedEmployee (String employeeId, String name, int monthPay, String socialSecurityNumber ) {
		super.employeeId=employeeId;
		super.name=name;
		this.monthPay=monthPay;
		this.socialSecurityNumber=socialSecurityNumber;
	}
	

//@Override toString:
		public String toString() {
			return ("ID:"+employeeId+", employers name: "+name+",");
		}	
	
	
// override interface method:	
	@Override 
	public int calculatePay() {
		int averageSal=monthPay;
		return averageSal;
	}

}
