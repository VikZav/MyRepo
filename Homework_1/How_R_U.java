import java.util.Scanner;
public class How_R_U {
	public static void main(String[ ] args) {
		String name;
		Integer age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Whats your name ?");
		name = sc.nextLine();
		System.out.println("How old are you ?");
		age = sc.nextInt();
		System.out.println("Your name is - "+name+ "\n"+"Your age is -"+age );
	}
}
