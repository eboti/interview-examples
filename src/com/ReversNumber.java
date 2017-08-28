package com;

public class ReversNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseNumber(23001));
	}

    public static int reverseNumber(int number){
        
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
    }
}
