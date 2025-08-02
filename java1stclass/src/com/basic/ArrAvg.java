package com.basic;

public class ArrAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,23,34,45,56,67,78,89};
		float sum=0; //var type float to get exact value of average
		for(int i=0; i< arr.length; i++) {
			sum+=arr[i];
		}
		float avg=sum/arr.length; //stores the average of the array values in variable avg
		System.out.println(avg);
	}

}
