package com.basic;

import java.util.Arrays;

public class StringSplit {
	public static String rev(String s) {		// reverse method
		String res="";
		for(int i=s.length()-1; i>=0; i--) {
			res += s.charAt(i);
		}
		return res;
	}
	
	public static String fcap(String s) {		//first letter caps
		String res="";
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(0);
			if(i==0 && (ch >=97 && ch<=122)) {
				res += ((char)(s.charAt(i)-32));
			}
			else {
				res +=s.charAt(i);
			}
		}
		return res;
	}
	
	public static String flcap(String s) {		//first and last letter caps
		String res="";
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if( (i==0 && (ch >=97 && ch<=122)) || (i==s.length()-1 && ch >=97 && ch<=122)) {
				res += ((char)(s.charAt(i)-32));
			}
			else {
				res +=s.charAt(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=("India is my country");
		String[]arr=s.split(" ");
		System.out.println(Arrays.toString(arr)); 	//string array print
		
		System.out.println();
		for(int i=arr.length-1; i>=0; i--) {		// string array elements rev
			System.out.print(arr[i]+" ");	
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
				
		for(int i=0; i<arr.length; i++) {			//str arr words rev
			System.out.print(rev(arr[i])+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
				
		for(int i=arr.length-1; i>=0; i--) {		//str rev
			System.out.print(rev(arr[i])+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
				
		for(int i=0; i<arr.length; i++) {
			System.out.print(fcap(arr[i])+" ");		//1st letter caps
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
				
		for(int i=0; i<arr.length; i++) {			//1st and last letter caps
			System.out.print(flcap(arr[i])+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
				
		for(int i=arr.length-1; i>=0; i--) {		//1st letter caps of rev str
			System.out.print(fcap(arr[i])+" ");	
		}

	}

}
