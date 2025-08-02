package com.basic;

public class ForPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=9;
		for(int i=1;i<=rows;i++) {
			for(int j=1; j<=rows;j++) {
				if(i==1 || j==1 || i==rows || j==rows || i==j || j==rows+1-i || i==rows/2+1 || j==rows/2+1 ) {
					System.out.print("*"+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=0; i<=5; i++) {
			for (int j=0; j<=6; j++) {
				if((i==1 && j%3==0)||(i==0 && j%3!=0)||(i-j==2)||(i+j==8)) {
					System.out.print("*"+" ");
				}else if(i==2 && j==2){
					System.out.print("K"+" ");
				}
				else if(i==2 && j==3){
					System.out.print("r"+" ");
				}
				else if(i==2 && j==4){
					System.out.print("u"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		for(int i=4; i>=0; i--) {
			for (int j=0; j<=6; j++) {
				if((i==1 && j%3==0)||(i==0 && j%3!=0)||(i-j==2)||(i+j==8)) {
					System.out.print("*"+" ");
				}else if(i==2 && j==2){
					System.out.print("K"+" ");
				}
				else if(i==2 && j==3){
					System.out.print("r"+" ");
				}
				else if(i==2 && j==4){
					System.out.print("u"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			for(int j=1; j<=rows;j++) {
				if(i==1 || j==1 || i==rows || j==rows || (i==rows/2+1 && j<=rows/2+1) || (j==rows/2+1 && i<=rows/2+1)) {
					System.out.print("*"+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

	}

}
