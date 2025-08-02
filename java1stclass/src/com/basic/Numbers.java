package com.basic;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=5;
		for ( int i=1; i<=k; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//even numbers
		int n=25;
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		//odd numbers
		for(int i=1; i<=n; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
	
		//same col print
		for ( int i=1; i<=n; i++) {
			System.out.print(i+" ");
			if(i%2==0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
	
		//tables
		for(int i=1; i<=10; i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//factors of n
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}

	}

}
