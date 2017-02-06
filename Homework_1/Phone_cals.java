import java.util.Scanner;
public class Phone_cals {
	public static void main(String[ ] args) {
		int c1, c2, c3, t1, t2, t3, call1, call2, call3, all;
		c1=1;
		c2=2;
		c3=3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть тривалість 1-ої розмови:");
		t1 = sc.nextInt();
		System.out.println("Введіть тривалість 2-ої розмови:");
		t2 = sc.nextInt();
		System.out.println("Введіть тривалість 3-ої розмови:");
		t3 = sc.nextInt();
		call1 = c1*t1;
		call2 = c2*t2;
		call3 = c3*t3;
		all = call1+call2+call3;
			System.out.println("1-а розмова:"+call1+ "\n"+ "2-га розмова:" +call2+ "\n"  +"3-тя розмова:" +call3+ "\n" +"Всі разом:" +all );
	}
}
