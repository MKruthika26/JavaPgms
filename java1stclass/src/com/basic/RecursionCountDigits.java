package com.basic;

public class RecursionCountDigits {
	public static int r_countdigit(int num,int count) {
		if(num==0) {
			return count;
		}
		return r_countdigit(num/10, count+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5235;
		int count=0;
		int digit=r_countdigit(num, count);
		System.out.println(digit);

	}

}
