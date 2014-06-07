import java.util.Scanner;
import java.util.regex.*;

public class Pr6_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String target = scan.nextLine();
		int counter = 0;
		
		String [] words = text.split("\\W+");
		for (String word : words) {
			if (word.toLowerCase().equals(target.toLowerCase())) {
				counter++;
			}
		}
		System.out.println(counter);

	}

}
