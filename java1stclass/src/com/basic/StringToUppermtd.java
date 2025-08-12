package com.basic;

public class StringToUppermtd {
	public static String upper(String s) {
		String res="";
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>=97 && ch<=122) {
				res+=((char)(ch-32));
			}
			else {
				res+=(ch);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=("HelLO There!");
		String res= upper(s);
		System.out.println(res);
	}

}
