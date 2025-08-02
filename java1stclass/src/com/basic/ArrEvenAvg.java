package com.basic;

public class ArrEvenAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,23,34,45,56,67,78,89};
		int sum=0;
		int count=0; //to count number of even elements present in the array
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
				count++; // increments by 1 for every even element
			}
		}
		float avg =sum/count; // TO GET THE AVG OF ONLY EVEN NUMBERS
		System.out.println(avg);
	}
}
