package com.basic;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=5;
		int n2=70;
		int max=(n1>n2)?n1:n2;
		for(int i=max; i<=(n1*n2); i++) {
			if(i%n1==0 && i%n2==0) {
				System.out.println(i);
			
			}
		}
		
	}

}
