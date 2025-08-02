package com.basic;

public class New {

	public static int d_num(int num) {
		int sum=0;
		while(num!=0) {
			int rem = num % 10;
			sum= sum+rem;
			num= num/10;
		}
		return sum;
	
	}
	public static int f_num(int num) {
		int digit=0;
		while(num!=0) {
			num=num/10;
			digit++;
		}
		return digit;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s=9;
		int num=1;
		int k=2;
		
		while( f_num(num)!=k || d_num(num)!=s) {
			num++;
		}	
		System.out.println(num);
		
	}

}
