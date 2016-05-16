package basics;

import java.util.Scanner;
import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.next();
		System.out.println(isValid(str));
		s.close();
	}

	public static boolean isValid(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : str.toCharArray()) {
			if (c == '{' || c == '(' || c == '[')
				stack.push(c);
			if (c == '}') {
				if (stack.isEmpty() || stack.pop() != '{')
					return false;
			}
			if (c == ']') {
				if (stack.isEmpty() || stack.pop() != '[')
					return false;
			}
			if (c == ')') {
				if (stack.isEmpty() || stack.pop() != '(')
					return false;
			}
		}
		return stack.isEmpty();
	}
}