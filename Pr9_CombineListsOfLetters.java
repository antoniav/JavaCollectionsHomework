import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Pr9_CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		char [] firstLine = scan.nextLine().replaceAll("\\W", "").toCharArray();
		char [] secondLine = scan.nextLine().replaceAll("\\W", "").toCharArray();
		
		ArrayList<Character> l1 = new ArrayList<>();
		ArrayList<Character> l2 = new ArrayList<>();
		
		for (int i = 0; i < firstLine.length; i++) {
			l1.add(firstLine[i]);
		}
		for (int j = 0; j < secondLine.length; j++) {
			l2.add(secondLine[j]);
		}
		
		List<Character> clonel1 = new ArrayList<>(l1);
		
		for (Character character : l2) {
			if (!clonel1.contains(character)) {
				l1.add(character);
			}
		}
		
		for (Character character : l1) {
			System.out.print(character + " ");
		}

	}

}
