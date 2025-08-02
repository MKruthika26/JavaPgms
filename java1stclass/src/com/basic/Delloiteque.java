package com.basic;

public class Delloiteque {
	
	public static int d_num(int num) {
		int sum=0;
		while(num!=0) {
			int rem = num % 10;
			sum= sum+rem;
			num= num/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=14;
		int gnum=num+1;
		while( d_num(num) * 2 != d_num(gnum)) {
			gnum++;
		}
		System.out.println(gnum);
	}

}
