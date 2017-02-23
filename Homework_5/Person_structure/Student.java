package Person_structure;

class Student extends Person {

	static final private String TYPE_PERSON="Student";

//Construct:		
	public Student(String name) {
		super(name);
		
	}

	@Override
	public String print() {
		return "I am a "+TYPE_PERSON;
	}

}
