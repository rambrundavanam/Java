package algorithms;

public class MaxMinsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { -8, 11, -9, -10, -4 };
		maxSum(a);
		minSum(a);
	}

	public static void minSum(int[] array) {
		int min_sofar = 0;
		int min_here = 0;
		for (int i = 0; i < array.length; i++) {
			min_here = min_here + array[i];
			if (min_here > 0)
				min_here = 0;
			if (min_sofar > min_here)
				min_sofar = min_here;
		}
		System.out.println(min_sofar);
	}

	public static void maxSum(int[] array) {
		int max_sofar = 0;
		int max_here = 0;
		for (int i = 0; i < array.length; i++) {
			max_here = max_here + array[i];
			if (max_here < 0)
				max_here = 0;
			if (max_sofar < max_here)
				max_sofar = max_here;
		}
		System.out.println(max_sofar);
	}

}
