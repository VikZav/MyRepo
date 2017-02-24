import java.util.Scanner;
public class RectangleArea {

// method for calculating area of rectangle:	
	static int squareRectangle (int a, int b)  {
		
		return a*b;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n;

//check a for imput character:	
		System.out.println("Imput side a:");
		while (!sc.hasNextInt()) {
	        System.out.println("Only numbers allowed!");
	        sc.next(); 
	    }
		m = sc.nextInt();

// check b for imput character:
		System.out.println("Imput side b:");
		while (!sc.hasNextInt()) {
	        System.out.println("Only numbers allowed!");
	        sc.next(); 
	    }
		n = sc.nextInt();
		
//throwing exeption if negative number:
		if (m <= 0 | n<=0) {
			throw new ArithmeticException("Negative number.");
		};
		
		System.out.println("Rectangle area: "+squareRectangle(m,n));

	}

}
