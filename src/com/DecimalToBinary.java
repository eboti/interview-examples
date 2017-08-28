package com;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println(convertDecimalToBinary(13));
		printBinaryFormat(13);
	}
	
	public static Object convertDecimalToBinary(int decimal){
		
		int binary[] = new int[10];
		int index = 0;
		
		while (decimal != 0){			
			int rest = decimal % 2;
			decimal = decimal/2;
			binary[index++] = rest;
		}

        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        
		return binary;
	}
	
	// other solution
    public static void printBinaryFormat(int number){
        int binary[] = new int[25];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
}
