package com.basic;

public class Happynum {
	
	public static int h_num(int num) {
		int sum=0;
		while(num!=0) {
			int rem= num % 10;
			sum= sum+(rem*rem);
			num= num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=7;
		int res= h_num(num);
		while(res!=1 && res!=4) {
			res = h_num(res);
		}
		if(res==1) {
			System.out.println("the num is happy");
		}else {
			System.out.println("its not");
		}
	}

}
