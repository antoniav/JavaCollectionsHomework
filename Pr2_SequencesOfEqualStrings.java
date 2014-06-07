import java.util.Scanner;

public class Pr2_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String input = scan.nextLine();
		String [] arrStrings = input.split(" ");
		
		System.out.print(arrStrings[0]);
		
		for (int i = 1; i < arrStrings.length; i++) {
			if (arrStrings[i].equals(arrStrings[i - 1])) {
				System.out.print(" " + arrStrings[i]);
			} else {
				System.out.println();
				System.out.print(arrStrings[i]);
			}
		}

	}

}
