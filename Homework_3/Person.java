import java.time.Year;


public class Person {
	private String name;
	private int birthYear;

	
// properties to get and set names of a student and year of birth:
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		}
	public int getBirthYear(){
		return birthYear;
	}
	public void setBirthYear (int birthYear){
	this.birthYear=birthYear;
	}
// constructors:
	public Person () {}
	public Person (String name,int birthYear) {
		this.name=name;
		this.birthYear=birthYear;
	
	}
//calculate age of a person:
	public int age () {
	return Year.now().getValue()-getBirthYear();
	}
//input info about student:
	public void input(String name,int birthYear) {
		setName (name);
		setBirthYear (birthYear);
	}
		
// output info about student:
	public String output () {
		return "Person's name: "+getName()+"\n"+"Person's year of birth:"+getBirthYear()+"\n"+"Person's age: "+age() ;
	}
			
//Change name of a person:
	public void changeName(String name) {
		setName(name);
		
	}
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.input ("Oleg", 1983);
		
		Person person2 =new Person();
		person2.input("Viktor", 1984);
		
		Person person3 = new Person();
		person3.input("Jummy", 1986);
		
		Person person4 = new Person();
		person4.input("Sanny", 1990);
		
		Person person5 = new Person();
		person5.input("Liza", 1991);
	
		
		
	}
	
}
