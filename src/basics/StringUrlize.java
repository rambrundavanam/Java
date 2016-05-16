package basics;

public class StringUrlize {

	public static void main(String[] args) {
		Urlize("Hi how are you");
	}

	public static void Urlize(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				sb.append("%20");
			} else {
				sb.append(s.charAt(i));
			}

		}
		System.out.println(sb.toString());
	}
}