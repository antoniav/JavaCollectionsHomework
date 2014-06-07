import java.util.Scanner;

public class Pr7_CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine().toLowerCase();
		String target = scan.nextLine().toLowerCase();
		int counter = 0;
		
		for (int i = 0; i <= text.length() - target.length(); i++) {
			if (text.substring(i, target.length() + i).equals(target)) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
		
