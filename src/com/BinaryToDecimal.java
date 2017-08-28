package com;


public class BinaryToDecimal {

	public static void main(String[] args) {
		
		int[] binary = new int[]{1, 0, 1, 1};
		convertBinaryToDecimal(binary);
	}
	
	public static void convertBinaryToDecimal(int[] binary){
		int decimal = 0;
		for (int i = binary.length; i>0; i--){
			int binaryElem = binary[i-1];
			if (binaryElem == 1){
				decimal += Math.pow(2, binary.length - i);
			}
		}
		
		System.out.println(decimal);
	}

}
