import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Pr8_ExtractEmails {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String text = scan.nextLine();
		
		Pattern emailPattern = Pattern.compile ("([_A-Za-z0-9-]+)(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})");
		Matcher matcher = emailPattern.matcher(text);
		
		while(matcher.find()){
			System.out.println(matcher.group());
		}
	}
}
