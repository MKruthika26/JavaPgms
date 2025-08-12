package com.basic;

import java.util.Arrays;

public class String2chararraymtd {
	public static char[] charArr(String s) {
		char[] arr=new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			arr[i]=s.charAt(i);
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=("hello");
		char res[]=charArr(s);
		System.out.println(Arrays.toString(res));
	}

}
