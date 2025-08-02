package com.basic;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int rows=5;
		for(int i=1; i<=rows; i++) {
			for(int sp=1; sp<=i-1; sp++) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=rows+1-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1; i<=rows; i++) {
			for(int sp=1; sp<=rows-i;sp++) {
				System.out.print(" "+" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1; i<=rows; i++) {
			for(int sp=1; sp<=rows-i; sp++) {
				System.out.print(" "+" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=rows; i>=1; i--) {
			for(int sp=1; sp<=i-1; sp++) {
				System.out.print(" "+" ");
			}
			for(int j=i; j<=rows; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=rows; i>=1; i--) {
			for(int sp=1; sp<=i-1; sp++) {
				System.out.print(" "+" ");
			}
			for(int j=rows; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	}

}
