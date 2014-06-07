import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Pr12_CardFrequencies {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String [] faces = scan.nextLine().split("[\\W]+");
		
		Map <String,Integer> facesFrequencies = new LinkedHashMap<>();
		
		for (String face : faces) {
			if(facesFrequencies.containsKey(face)) {
				facesFrequencies.put(face, facesFrequencies.get(face) + 1);
			} else {
				facesFrequencies.put(face, 1);
			}
		}
		DecimalFormat formatter = new DecimalFormat("#0.00");
		for (Map.Entry<String, Integer> face : facesFrequencies.entrySet()) {
			System.out.println(face.getKey() + "-> " + 
					formatter.format((double)face.getValue()/faces.length*100) + "%");
		}

	}

}
