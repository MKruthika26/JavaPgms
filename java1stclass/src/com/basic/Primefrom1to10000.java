package com.basic;

public class Primefrom1to10000 {
	
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
		
		for(int k=1; k<=10000; k++) {
			int n=k;
			int count=prime_fact(n);
			if(count==2) {
				System.out.println(n);
			}
			
		}
		
	}

}
