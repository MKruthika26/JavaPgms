package com.basic;

public class StringCompare2charArray {
	public static boolean check_array(char []arr,char []res) {
		if(arr.length != res.length) {
			return false;
		}
		for (int i=0; i<arr.length; i++) {
			if(arr[i] != res[i]) {
				return false;
			}
		}
		return true;
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
		String s1=("kruthika");
		String s2=("Kruthika");
		char res1[]=charArr(s1);
		char res2[]=charArr(s2);
		boolean res= check_array(res1, res2);
		System.out.println(res);
	}

}
