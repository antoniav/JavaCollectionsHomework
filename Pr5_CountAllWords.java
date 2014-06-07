import java.util.Scanner;
import java.util.regex.*;

public class Pr5_CountAllWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(input.split("\\W+").length);

	}

}
