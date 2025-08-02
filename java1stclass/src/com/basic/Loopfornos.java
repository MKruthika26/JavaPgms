package com.basic;

public class Loopfornos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=5; i++) {
			for(int j=i; j>=1; j--) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();	
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int a=5; a>=1; a--) {
			for(int b=a; b<=5; b++) {
				System.out.print((char)(b+64)+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int A=65; A<=69; A++) {
			for(int B=65; B<=A; B++) {
				System.out.print((char)B+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();	
		}
		System.out.println();
		System.out.println();
		System.out.println(); 
		
		
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" "+" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();	
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for (int i=5; i>=1; i--) {
			for(int j=1; j<i; j++) {
				System.out.print(" "+" ");
			}
			for (int j=i; j<=5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for (int i=5; i>=1; i--) {
			for (int sp=1; sp<i; sp++) {
				System.out.print(" "+" ");
			}
			for (int j=5; j>=i; j--) {
				System.out.print(j+" ");
			} 
			System.out.println();
		}
		
	}

}
