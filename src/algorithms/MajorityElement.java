package algorithms;

class Solution {
	
	static int findCandidate(int[] array) {
		int majority_index = 0, count = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[majority_index] == array[i])
				count++;
			else
				count--;
			if (count == 0) {
				majority_index = i;
				count = 1;
			}
		}
		return array[majority_index];
	}

	static boolean isMajority(int[] array, int candidate) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == candidate)
				count++;
			if (count > array.length / 2)
				return true;
		}
		return false;
	}

	static void printMajority(int[] array) {
		int candidate = findCandidate(array);
		if (isMajority(array, candidate)) {
			System.out.println("Majority is:" + candidate);
		}
	}

	public static void main(String[] args) {
		int[] a2 = { 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4 };
		printMajority(a2);
	}
}
