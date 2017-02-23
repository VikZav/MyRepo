package Person_structure;

class Cleaner extends Staff {

  static final String TYPE_PERSON="Cleaner";

	
	public Cleaner(String name) {
		super(name);
	    
			
	}

	
	@Override int salary() {
		
		return 120;
	}

	@Override
	public String print() {
		return "I am a "+TYPE_PERSON;
	}
	
}
