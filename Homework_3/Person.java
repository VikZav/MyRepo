
public class Person {
	private String name;
	private int birthYear;

	
// properties to get and set names of a student and a births of year:
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		}
	public int getbirthYear(){
		return birthYear;
	}
	public void setbirthYear (int birthYear){
	this.birthYear=birthYear;
	}
//default constructor:
	public Person () {
		}
// constructor with 2 param:
	public Person (String name,int birthYear) {
		this.name=name;
		this.birthYear=birthYear;
	
	}
//return age of a person:
	public int age () {
		return 2017-birthYear;
	}
//input info about student:
	public void input(String name,int birthYear) {
		setName (name);
		setbirthYear (birthYear);
	}
	
	

	
// output info about student:
	public void output () {
		System.out.println("Person's name:"+getName()+"\n"+"Person's year of birth:"+getbirthYear()+"\n"+"Person's age:"+age() );
	}
		
	
//hsnage name of a person:
	public void changeName(String name) {
		this.name=name;
		
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
