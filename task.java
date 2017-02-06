
import java.util.Scanner;

public class task {
	
	public static void main(String[ ] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть число a:");
		a = sc.nextInt();
		System.out.println("¬вед≥ть число b:");
		b = sc.nextInt();
		int res1 = a+b;
		int res2 = a-b;
		int res3 = a*b;
		int res4 = a/b;
		System.out.println("a+b="+res1);
		System.out.println("a-b="+res2);
		System.out.println("a*b="+res3);
		System.out.println("a/b="+res4);
		
	}
}
