package com.basic;

import java.util.Arrays;

public class StringSort {
	public static void b_sort(char arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr.length-1; k++) {
				if(arr[k]>arr[k+1]) {
					char temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static char[] charArr(String s) {
		char[] arr=new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			arr[i]=s.charAt(i);
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=("kruthika");
		char res[]=charArr(s);
		b_sort(res);

	}

}
