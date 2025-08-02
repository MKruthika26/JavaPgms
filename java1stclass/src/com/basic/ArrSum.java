package com.basic;

public class ArrSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,23,34,45,56,67,78,89};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i]; //array element is added to the sum for every increment of i 
		}
		System.out.println(sum);
	}

}
