package algorithms;

import java.util.Scanner;

public class RLEncoding {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.nextLine();
		runLen(str);
		s.close();
	}

	public static void runLen(String s) {
		StringBuilder output = new StringBuilder();
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			output.append(s.charAt(i));
			counter = 1;
			while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				counter++;
				i++;
			}
			output.append(Integer.toString(counter));
		}
		if (output.length() > s.length()) {
			System.out.println(s);
			;
		} else
			System.out.println(output.toString());
	}
}