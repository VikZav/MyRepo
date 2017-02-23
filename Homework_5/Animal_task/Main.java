package Animal_task;

public class Main {

		 
	
	public static void main(String[] args) {
// Array of animals:		
		Animal pets [] = {
				new Dog ("Wolf"),
				new Cat ("Tiger"),
				new Dog ("Rex"),
				new Cat ("Nikky"),

		};
		
// display array with methods:		
		for (int i=0; i<4; i++) {
			System.out.println(pets[i].toString()+", make noise: "+pets[i].voice()+", and not a hungry="+pets[i].feed() );
		}
		

		
	}

}
