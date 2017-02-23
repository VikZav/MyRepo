package Person_structure;

class Main {

	

	public static void main(String[] args) {
		
		Person People [] = {
				new Teacher ("Viktor"),
				new Cleaner ("Marina"),
				new Student ("John"),
			};				
				
			
	for (int i=0; i<People.length; i++) {		
		System.out.print(People[i].print());
		if (People[i] instanceof Staff) {
			System.out.println(", my salary is "+((Staff)People[i]).salary());
		} else {System.out.println(", i am getting scholarship.");}
	
	}
	
	
	
	
	
	
		}

	}


