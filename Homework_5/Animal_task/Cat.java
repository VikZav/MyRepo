package Animal_task;

public class Cat implements Animal{




// default constructor
	
	private String name;


	Cat (String name){
		this.name=name;
	}
	
	
    public String voice () {
	
	return "Purr ... purr";
	
}
   
    public Boolean feed() {
	//some code about animal feeding 
	return true;
	}
	
    @Override
	 public String toString() {
	return "Cat's name="+name;
	 }		
	


	


	

}
