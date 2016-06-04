package basics;

import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SmallProblems {

	public static void main(String[] args) {

		System.out.println("Palindrome:" + isPalindrome("tacocat"));// basic
		// palindrome
		// check
		System.out.println("Prime number:" + isPrime(1549));// see if the number
		// is a prime number
		insertSpace("aaaabbbbcccc");// insert spaces between characters
		permutation("", "abc");// all permutations of a string
		removeduplicates("abdccdddccccdddddcccdd");// remove duplicate
		// characters
		int[] array = { -1, 1, 0, 2, -3, 4, 3, 5, 6, -5 };
		subArray(array, 11);// returns subarray whose sum is equal to k
		reverseString("This is Ram Brundavanam");// reverse words in a string

	}

	static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left++) != s.charAt(right--)) {
				System.out.println("Not a palindrome");
				return false;
			}
		}
		return true;
	}

	static boolean isPrime(int num) {
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	static void kthSmallest(int array[], int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < array.length; i++) {
			pq.add(array[i]);
		}

		for (int i = 0; i < k - 1; i++) {
			pq.poll();
		}
		System.out.println(pq.peek());
	}

	public static void subArray(int[] array, int sum) {
		int curr_sum = array[0];
		int start = 0;
		for (int i = 1; i < array.length; i++) {
			while (curr_sum > sum && start < i - 1) {
				curr_sum = curr_sum - array[start];
				start++;
			}
			if (curr_sum == sum)
				System.out.println(start + " " + (i - 1));
			if (i < array.length)
				curr_sum += array[i];
		}
	}

	public static void reverseString(String s) {
		String[] str = s.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i] + " ");
		}
	}

	public static void removeduplicates(String s) {
		Set<Character> set = new LinkedHashSet<Character>();
		for (char c : s.toCharArray()) {
			set.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for (Character c : set) {
			sb.append(c);
		}

		System.out.println(sb.toString());
	}

	public static void permutation(String a, String s) {
		if (s.length() == 0)
			System.out.print(a + ",");
		else {
			for (int i = 0; i < s.length(); i++)
				permutation(a + s.charAt(i), s.substring(0, i) + s.substring(i + 1, s.length()));
		}
	}

	public static void insertSpace(String s) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}

}