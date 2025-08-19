package com.basic;

public class StringSubStrPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=("hello");
		for(int i=0; i<s.length(); i++) {
			for (int j=i; j<s.length(); j++) {
				System.out.println(s.substring(i, j+1));
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=0; i<s.length(); i++) {
			for (int j=i; j<s.length(); j++) {
				String res="";
				for(int k=i; k<=j; k++) {
					res += s.charAt(k);
				}
				System.out.println(res); 
			}
		}
	}

}
