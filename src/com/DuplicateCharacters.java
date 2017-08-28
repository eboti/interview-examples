package com;

public class DuplicateCharacters {

	public static void main(String[] args) {
		

		String str = "Abcddefffghijj";
		
		for (int i = 0; i < str.length()-2; i++){
			if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) != str.charAt(i+2)){
				System.out.println(str.charAt(i));
			}
		}
	}

}
