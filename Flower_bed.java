import java.util.Scanner;
public class Flower_bed {
	public static void main(String[ ] args) {
		int radius;
		double peri;
		double area;
		System.out.println("Ѕудь-ласка, введ≥ть рад≥ус:");
		Scanner sc = new Scanner(System.in);
		radius = sc.nextInt();
		peri = 2*Math.PI*radius;
		area = Math.PI*Math.pow(radius, 2);
		System.out.println("ќкружн≥сть "+ peri);
		System.out.println("ѕлоща "+ area);
		
	}
}
