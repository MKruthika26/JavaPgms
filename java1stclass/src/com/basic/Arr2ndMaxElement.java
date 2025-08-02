package com.basic;

public class Arr2ndMaxElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,6,0,-1,-10};
		int max1=Integer.MIN_VALUE;//takes the min value of integer i.e. -2147483648
		int max2 =Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max1) { 
				max2=max1;
				max1=arr[i];									
			} else if(arr[i]>max2 && max2!=max1) {
				max2=arr[i];
			}
		}
		System.out.println("maximum no. is: "+max1);
		System.out.println("2nd maximun no. is: "+max2);
	}

}
