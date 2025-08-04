package com.basic;

public class ArrSorted{
	public static boolean issorted(int [] arr) {
		for (int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {10,20,30,40,50,60,70};
		System.out.println(issorted(arr));
		
	}

}
