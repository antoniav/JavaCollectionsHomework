import java.util.Arrays;
import java.util.Scanner;

public class Pr1_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("n = ");
		int n = scan.nextInt();
		scan.nextLine();
		int[]arrNumbers = new int [n];
		for (int i = 0; i < arrNumbers.length; i++) {
			arrNumbers[i] = scan.nextInt();
		}
		Arrays.sort(arrNumbers);
		
		for (int j = 0; j < arrNumbers.length; j++) {
			System.out.println(arrNumbers[j]);
		}
	}

}
