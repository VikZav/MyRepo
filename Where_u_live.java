import java.util.Scanner;
public class Where_u_live {
	public static void main(String[ ] args) {
		String name;
		int age;
		String live;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Whats your name ?");
		name = sc.nextLine();
		System.out.println("Where you live, "+ name);
		live = sc.nextLine();
		System.out.println( "Your name is " + name + ", and you live in "+ live+ "!");
		
	}
}
