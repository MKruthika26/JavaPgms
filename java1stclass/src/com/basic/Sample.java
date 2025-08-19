package com.basic;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j||j==n+1-i) {
					System.out.print(i+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}

}
