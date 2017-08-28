package com;

public class ReverseStringRecursive {

	public static String reverse = "";
	
	public static void main(String[] args) {
		
		System.out.println(reverse("asdf"));

	}
	
	public static String reverse(String str){

		System.out.println("str: " + str);
		System.out.println("reverse: " + reverse);
		System.out.println();
		
		if (str.length() == 1){
			return reverse + str;
		}else{
			reverse += str.charAt(str.length()-1);
			str = str.substring(0, str.length()-1);
			return reverse(str);
		}
		
	}

}
