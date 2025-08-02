package com.basic;

public class CountnoOfdigits {
	
	public static int count_digit(int num) {
		int digit=0;
		while(num!=0) {
			num=num/10;
			digit++;
		}
		return digit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23445;
		int digit=count_digit(num);
		System.out.println(digit);
		

	}

}
