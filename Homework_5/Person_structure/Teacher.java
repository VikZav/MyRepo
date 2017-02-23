package Person_structure;

class Teacher extends Staff {

	
	static final String TYPE_PERSON="Teacher";
	
	public Teacher(String name) {
		super(name);
		
	}

	@Override
	int salary() {
			return 300;
	}

	@Override
	public String print() {
		return "I am a "+TYPE_PERSON;
	}


}
