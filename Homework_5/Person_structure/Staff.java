package Person_structure;

 abstract class Staff extends Person {
	
	
	public Staff(String name) {
		super(name);
		
	}

	@Override
	public String print() {
		
		return "I am a stuff";
	}

// abstract method salary	
	abstract int salary ();
	
		
}
