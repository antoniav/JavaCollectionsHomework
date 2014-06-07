import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Pr10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String [] words = scan.nextLine().toLowerCase().split("\\W+");
		Set <String> uniqueWords = new TreeSet<String>();
		for (String word : words) {
			if (!uniqueWords.contains(word)) {
				uniqueWords.add(word);
			}
		}
		uniqueWords.stream().forEach(x -> System.out.print(x + " "));

	}

}
