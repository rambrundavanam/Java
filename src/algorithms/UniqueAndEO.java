package algorithms;

import java.util.Scanner;

public class UniqueAndEO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int array[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,6,7,8,9};
		oddEven(n);
		oddEven2(n);
		oddEven3(n);
		findUnique(array);//find the unique element in the array
	
	}

	public static void oddEven(int num) {
		if ((num & 1) == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

	public static void oddEven2(int num) {
		if (num % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

	public static void oddEven3(int num) {

		int n = num / 2;
		if (2 * n == num)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

	public static void findUnique(int[] array) {
		int x = 0;

		for (int i = 0; i < array.length; i++) {
			x = x ^ array[i];
		}
		System.out.println(x);
	}

}
