
public class Employee {
 private String name;
 private double rate;
 private int hours;
 private static int totalHours;
 

 // setters and getters
 public String getName() {
		return name;
	}
 public double getRate() {
		return rate;
	}
 public int getHours() {
		return hours;
	}
 public int getTotalHours() {
		return totalHours;
	}
 public void setName(String name) {
		this.name = name;
		}
 public void setRate(double rate) {
		this.rate = rate;
		}
 public void setHours(int hours){
	 	this.hours=hours;
 }
 // constructors
 public Employee (){ }
 public Employee (String name, double rate) {
	 this.name=name;
	 this.rate=rate;
 }
 public Employee (String name, double rate, int hours) {
	 this.name=name;
	 this.rate=rate;
	 this.hours=hours;
 }

 // method salary
 public double salary (){
	 return rate*hours;
}
@Override
public String toString() {
	return "Employee name="+getName()+", work rate="+getRate()+", hours="+getHours()+", salary="+totalSalary();
}
//method change rate
public void changeRate (double rate) {
	setRate (rate);

	}
//bonus 30% to salary.
public double bonuses (){
	return salary()*0.3;
}
//total salary with bonuses:
public double totalSalary () {
	return salary()+bonuses();
}
//all workers worked hours counter
public void totalHCounter (){
	totalHours=totalHours+getHours();
	
}

public static void main(String[] args) {
	Employee empl1 = new Employee ();
	empl1.setName("Haru");
	empl1.setRate(1.0);
	empl1.setHours(40);
	empl1.totalHCounter();
	Employee empl2 = new Employee("Yao", 1.2, 35) ;
	empl2.totalHCounter();
	Employee empl3 = new Employee("Min", 1.3, 30);
	empl3.totalHCounter();	
	System.out.println(empl1.toString()+"\n"+empl2.toString()+"\n"+empl3.toString());
	System.out.println("Workers total workeed hours is "+totalHours);	
}





}