package com.basic;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		for(int i=1; i<=n-2; i++) {
			int temp=a+b;
			System.out.print(" "+temp);
			a=b;
			b=temp;
		}

	}

}
