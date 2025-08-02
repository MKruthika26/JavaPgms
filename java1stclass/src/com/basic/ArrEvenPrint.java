package com.basic;

public class ArrEvenPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,23,34,45,56,67,78,89};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) { //to select only even numbers present in the array
				sum+=arr[i]; //adds all the even elements to sum
			}
		}
		System.out.println(sum);
	}
}
