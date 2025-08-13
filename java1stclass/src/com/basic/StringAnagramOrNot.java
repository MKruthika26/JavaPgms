package com.basic;

import java.util.Arrays;

public class StringAnagramOrNot {
	public static String cov_lower(String s) {
		String res="";
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90) {
				res+=((char)(ch+32));
			}
			else {
				res+=ch;
			}
		}
		return res;
	}
	
	public static char[] chararr(String s) {
		char arr[]=new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			arr[i]=s.charAt(i);
		}
		return arr;
	}
	
	public static void b_sort(char arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]){
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static boolean compare(char arr1[], char arr2[]) {
		if(arr1.length != arr2.length) {
			return false;
		} for(int i=0; i<arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=("Listen");
		String s2=("Silent");
		
		String a=cov_lower(s1);
		String b=cov_lower(s2);
		
		char[] arr1=chararr(a);
		char[] arr2= chararr(b);
		
		b_sort(arr1);
		b_sort(arr2);
		
		if(compare(arr1,arr2)==true) {
			System.out.println("its anagram");
		}else {
			System.out.println("is not");
		}
		
	}

}
