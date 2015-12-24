package com;

public class CharAtMethodMain {

	public static void main(String[] args) {
		String string="charAtMethodImplementation";
		int index=13;
		System.out.println("Character at "+index+" is : "+charAt(string,index-1));
	}

	private static char charAt(String string, int index) {
		String subString=string.substring(index, index+1);
		char array[]=subString.toCharArray();
		return array[0];
	}

}
