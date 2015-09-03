package Concordance;

public class Concordance {

	String position(String string, char characterOfString) {
		//Function for counting occurrence of character in string
		String position = "";
		for (int i = 0; i < string.length(); i++) {

			if (characterOfString == string.charAt(i)) {
				position=position+i+" ";
			}
		}
		return position;
	}
}
