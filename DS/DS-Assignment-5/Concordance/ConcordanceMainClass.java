package Concordance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ConcordanceMainClass {

	public static void main(String[] args) {

	Concordance concordance = new Concordance();
		HashMap<Character, String> hashMap = new HashMap<Character, String>();

		System.out.print("Enter a String : ");

		try {
			//bufferReader is used to take string input from console with space
			BufferedReader bufferRead = new BufferedReader(
					new InputStreamReader(System.in));
			String concordanceString = bufferRead.readLine();
			
			//To count concordance
			for (int i = 0; i < concordanceString.length();i++) {
				if (concordanceString.charAt(i) != ' ') {
					hashMap.put(concordanceString.charAt(i), concordance
							.position(concordanceString,
									concordanceString.charAt(i)));
				}
				
			}
			
			//Print occurrence of each character in String
			for (Map.Entry map : hashMap.entrySet()) {
				System.out.println(map.getKey() + "= [" + map.getValue() + "]");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
