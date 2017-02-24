import java.util.InputMismatchException;
import java.util.Scanner;
public class DivClas {
	
	
	static double div (double a, double b){
// check for below zero number:
		if (a<= 0 | b<=0) {
		    throw new ArithmeticException("Illegal number (below zero).");
		}
		return a/b;
	};
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double m, n;
		System.out.println("Enter positive number a:");

//chek for imputing number a:
		if (!sc.hasNextDouble()) {
			throw new InputMismatchException("Only numbers allowed");
	    	    }
		m = sc.nextDouble();
		System.out.println("Enter positive number b:");

//chek for imputing number b:		
		if (!sc.hasNextDouble()) {
			throw new InputMismatchException("Only numbers allowed");
	    	    }
		n = sc.nextDouble();
		System.out.println("Result a/b = "+div(m, n));
	
		
	}

}
