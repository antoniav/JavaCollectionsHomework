import java.util.Scanner;

public class Pr3_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] words = input.split(" ");

		int counter = 1;
		int maxCounter = 1;
		String word = words[0] + " ";
		for (int i = 0; i < words.length - 1; i++) {
			if (words[i].equals(words[i + 1])) {
				counter++;

				if (maxCounter < counter) {
					word = words[i] + " ";
					maxCounter = counter;
				}

			} else {
				counter = 1;
			}
		}
		for (int i = 0; i < maxCounter; i++) {
			System.out.print(word);
		}
	}
}
