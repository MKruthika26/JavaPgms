package com.basic;

public class Primeornot {
	public static int prime_fact(int n) {
		int count=0;
		for (int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=24;
		int count=prime_fact(n);
		if(count==2) {
			System.out.println("its prime");
		}else {
			System.out.println("its not a prime");
		}

	}

}
