package com.basic;

public class Nestedfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows =1;
		for(int i=rows; i<=5; i++) {
			for(int j=i; j<=5; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
