package com.basic;

public class ArrMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {345,24,534,66,75,32,754,97};
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}
