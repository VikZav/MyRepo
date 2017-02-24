import java.util.Scanner;

public class ReadingNumbers {

	 static public int readNumber (int start, int end, int a) throws IllegalArgumentException, NumberFormatException {
//check for proper range number:
		 if (a>start && a<end) {
		   return a;
		} 	else {
		    throw new IllegalArgumentException("Your number out of range.");
	}
		
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Please, enter any number betwen 10 and 50:");
//check for characters:
		if (!sc.hasNextInt()) {
			throw new NumberFormatException ("Must enter number only");
		}
		x = sc.nextInt();
	
		System.out.println("Your number is "+readNumber (10, 50, x)+".");
		

	}

}
