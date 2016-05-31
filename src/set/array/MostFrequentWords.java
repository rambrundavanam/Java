import java.io.*;
import java.util.*;

//Shows the 5 most frequent words in the List of words
public class MostFrequentWords {
	public static void main(String[] args) {
		String s = "Welcome to the world of Geeks This portal has been created to provide well written well thought and well explained solutions for selected questions If you like Geeks for Geeks and would like to contribute here is your chance You can write article and mail your article to contribute at geeksforgeeks org See your article appearing on the Geeks for Geeks main page and help thousands of other Geeks";
		String[] array = s.split(" ");
		int k = 5;
		ArrayList<Words> al = new ArrayList<Words>();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String string : array) {
			if (hm.containsKey(string)) {
				hm.put(string, hm.get(string) + 1);
			} else {
				hm.put(string, new Integer(1));
			}
		}
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			al.add(new Words(entry.getKey(), entry.getValue()));
		}
		Collections.sort(al, new Words());
		for (int i = 0; i < 5; i++) {
			System.out.println(al.get(i).word + " " + al.get(i).value);
		}
	}
}

class Words implements Comparator<Words> {

	String word;
	int value;

	public Words(String word, int value) {
		this.word = word;
		this.value = value;
	}

	public Words() {
	}

	public int compare(Words o1, Words o2) {
		if (o1.value >= o2.value) {
			return -1;
		} else {
			return 1;
		}
	}
}
