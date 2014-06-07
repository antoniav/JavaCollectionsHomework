import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Pr11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] words = scan.nextLine().toLowerCase().split("\\W+");
		
		TreeMap<String, Integer> counter = new TreeMap <> ();
		
		for (String word : words) {
			if (counter.containsKey(word)) {
				counter.put(word, counter.get(word) + 1);
			} else {
				counter.put(word, 1);
			}
		}
		
		int mostFrequent = 0;
		for (Map.Entry<String, Integer> word : counter.entrySet()) {
			if(mostFrequent < word.getValue()){
				mostFrequent = word.getValue();
			} 
		}
		for (Map.Entry<String, Integer> word : counter.entrySet()) {
			if(mostFrequent == word.getValue()){
				System.out.println(word.getKey() + " -> " + word.getValue());
			}
		}
	}
}


