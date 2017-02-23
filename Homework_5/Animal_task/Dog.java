package Animal_task;

public class Dog implements Animal {
	
private String name;

//default constructor	
	Dog (String name) {
		this.name=name;
	}
	
	public String  voice () {
		return "Woof ... woof";
		
	}
	public Boolean feed() {
		//some dog's eating code =)
		return true;
	}
	
	@Override
	 public String toString() {
	return "Dog's name="+name;
	 }		
		
	
	
}
