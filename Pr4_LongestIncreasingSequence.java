import java.util.Scanner;

public class Pr4_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String input = scan.nextLine();
		String [] arrStrings = input.split(" ");
		
		int [] numbers = new int [arrStrings.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers [i] = Integer.parseInt(arrStrings[i]);
		}
		
		int counter = 1;
		int maxCounter = 1;
		int position = 0;
		
		System.out.print(numbers[0] + " ");
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers [i - 1]) {
				System.out.print(numbers[i] + " ");
				counter++;
			} else {
				counter = 1;
				System.out.println();
				System.out.print(numbers[i] + " ");
			}
			if (maxCounter < counter) {
				maxCounter = counter;
				position = i;
			}
		}
		System.out.println();
		System.out.print("Longest: ");
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(numbers[position - counter + 1 + j] + " ");
		}
		System.out.println(numbers[position]);

	}

}
