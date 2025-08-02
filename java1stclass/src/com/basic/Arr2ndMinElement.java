package com.basic;

public class Arr2ndMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,6,0,-1,-10};
		int min1=Integer.MAX_VALUE;//takes the max value of integer i.e. 2147483647
		int min2 =Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min1) { 
				min2=min1;
				min1=arr[i];									
			} else if(arr[i]<min2 && min2!=min1) {
				min2=arr[i];
			}
		}
		System.out.println("minimun no. is: "+min1);
		System.out.println("2nd minimum no. is: "+min2);
	}

}
