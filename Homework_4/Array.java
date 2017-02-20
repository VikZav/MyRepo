
public class Array {
	int arr1 [ ]  = {2, -4, 1, 3, 8, 7, -9, 10, 5, -6 };

//biggets of this numbers:	
	public int maxEl () {
		int max = arr1[0];
		int imax = 0;
		int i = 0;
		while (i < arr1.length) {
			if (arr1[i] > max) {
				max = arr1[i];
				imax = i;
			}
			i++;
		}
		return max;
	}
	
//sum of a positive numbers in the array:
	public int sumPos () {
		int product = 0;
		for (int i = 0; i < 10; i++) {
			if (arr1[i] > 0) {product = product + arr1[i];}}
		return product;
	}
	
//amount of positive numbers:
	public int numPositive () {
		int amount = 0;
		for (int a : arr1) {
			if (a > 0 && a <= 10) { amount++; }
		}
		return amount;
	} 
//amount of negative numbers:
	public int  numNegative () {
		int amount = 0;
		for (int a : arr1) {
			if (a < 0) { amount++; }
		}
		return amount;
		
	}
//What values there are more:
	
	
	public static void main(String[] args) {
		Array qwerty = new Array();
		System.out.println("Biggets number in array  = "+qwerty.maxEl());
		System.out.println("Sum of positive numbers = " + qwerty.sumPos());
		System.out.println("Amount of positive numbers = " + qwerty.numPositive());
		System.out.println("Amount of negative numbers = " + qwerty.numNegative());

//What values there are more ?
		if (qwerty.numNegative()< qwerty.numPositive()) {
			System.out.println("Positive values are more.");
		} else if (qwerty.numNegative()> qwerty.numPositive()) {
			System.out.println("Negative values are more.");
		} else {System.out.println("Positive and negative are equal."); }
	}
	
	
	
}
