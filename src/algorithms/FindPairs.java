package algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { -1, 1, 0, 2, -3, 4, 3, 5, 6, -5 };
		findPairsIP(array, 6);
		System.out.println("\n");
		findPair(array, 6);
		System.out.println("\n");
		findPairs(array, 6);

	}

	// O(n2)
	public static void findPair(int[] array, int sum) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == sum)
					System.out.print("[" + array[i] + "," + array[j] + "]");
			}
		}
	}

	// O(n)
	public static void findPairs(int[] array, int sum) {
		if (array.length < 2)
			return;
		Set<Integer> set = new HashSet<Integer>(array.length);
		for (int value : array) {
			int target = sum - value;
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.print("[" + target + "," + value + "]");
			}
		}
	}

	// in place
	public static void findPairsIP(int[] array, int tsum) {
		if (array.length < 2)
			return;
		Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			int sum = array[left] + array[right];
			if (sum == tsum) {
				System.out.print("[" + array[left] + "," + array[right] + "]");
				left++;
				right--;
			} else if (sum < tsum) {
				left += 1;
			} else if (sum > tsum) {
				right -= 1;
			}
		}
	}
}
