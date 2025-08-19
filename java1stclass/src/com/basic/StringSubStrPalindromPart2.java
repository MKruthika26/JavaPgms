package com.basic;

public class StringSubStrPalindromPart2 {

	public static String rev(String s) {
		String res="";
		for(int i=s.length()-1; i>=0; i--) {
			res+=s.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=("malayalam");
		for(int i=0; i<s.length(); i++) {
			for (int j=i; j<s.length(); j++) {
				String res="";
				for(int k=i; k<=j; k++) {
					res += s.charAt(k);		
				}
				if(res.equals(rev(res))) {
					System.out.println(res); 
				}
				
			}
		}
	}

}
