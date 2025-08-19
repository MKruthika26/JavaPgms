	package com.basic;

public class Que {
	public static String rev(String s) {
		String res="";
		for(int i=s.length()-1; i>=0; i--) {
			res+=s.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=("ABDEF");
		String res= rev(s);
		for(int i=0; i<res.length(); i++) {
			char ch= res.charAt(i);
			System.out.print((char)(ch+1));
		}
		
	}

}
