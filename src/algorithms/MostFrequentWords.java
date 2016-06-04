package algorithms;
import java.util.*;

//Shows the 5 most frequent words in the List of words
public class MostFrequentWords {
	
	public static void main(String[] args) {
		String s = "Welcome to the world of Geeks This portal has been created to provide well written well thought and well explained solutions for selected questions If you like Geeks for Geeks and would like to contribute here is your chance You can write article and mail your article to contribute at geeksforgeeks org See your article appearing on the Geeks for Geeks main page and help thousands of other Geeks";
		String[] array = s.split(" ");
		int k = 5;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		PriorityQueue<Words> pq = new PriorityQueue<Words>();
		for (String string : array) {
			if (hm.containsKey(string)) {
				hm.put(string, hm.get(string) + 1);
			} else {
				hm.put(string, new Integer(1));
			}
		}
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			pq.add(new Words(entry.getKey(), entry.getValue()));
		}
		for (int i = 0; i < k; i++) {
			System.out.println(pq.poll().toString());
		}
	}
}

class Words implements Comparable<Words> {

	String word;
	int value;

	public Words(String word, int value) {
		this.word = word;
		this.value = value;
	}

	public Words() {
	}

	public int compareTo(Words o) {
		if (this.value >= o.value) {
			return -1;
		} else {
			return 1;
		}
	}
	
	public String toString(){
		return this.word+" : "+this.value;
	}
}
