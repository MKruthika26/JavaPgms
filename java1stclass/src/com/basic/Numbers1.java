package com.basic;

public class Numbers1 {
	
	public static int count_fact(int n) {
		int count=0;
		for (int i=1; i<=n; i++) {
			if(n%i==0) {
				//System.out.print(i);
				count++;
			}
		}
		return count;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=24;
		int count=count_fact(n);
		System.out.println(count);
		
		}
}
