package com.basic;

public class Pyramidfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for (int i=1; i<=rows; i++) {
			for (int sp=1; sp<=rows-i; sp++) {
				System.out.print(" "+" ");
			}
			for (int j=rows; j>=rows+1-i; j--) {
				System.out.print(j+" ");
			}
			for(int j=rows+2-i; j<=rows; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int i=1; i<=rows; i++) {
			for (int sp=1; sp<=rows-i; sp++) {
				System.out.print(" "+" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			for(int j=i-1; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int i=1; i<=rows; i++) {
			for (int sp=1; sp<=rows-i; sp++) {
				System.out.print(" "+" ");
			}
			for (int j=i; j>=1; j--) {
				System.out.print(j+" ");
			}
			for(int j=2; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int i=1; i<=rows; i++) {
			for (int sp=1; sp<=rows-i; sp++) {
				System.out.print(" "+" ");
			}
			for (int j=rows; j>=rows+1-i; j--) {
				System.out.print((char)(64+j)+" ");
			}
			for(int j=rows+2-i; j<=rows; j++) {
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int i=1; i<=rows; i++) {
			for (int sp=1; sp<=rows-i; sp++) {
				System.out.print(" "+" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print((char)(64+j)+" ");
			}
			for(int j=i-1; j>=1; j--) {
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int i=1; i<=rows; i++) {
			for (int sp=1; sp<=rows-i; sp++) {
				System.out.print(" "+" ");
			}
			for (int j=i; j>=1; j--) {
				System.out.print((char)(64+j)+" ");
			}
			for(int j=2; j<=i; j++) {
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
	}

}
