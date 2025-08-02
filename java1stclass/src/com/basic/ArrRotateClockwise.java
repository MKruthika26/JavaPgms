package com.basic;

import java.util.Arrays;

public class ArrRotateClockwise {
	public static void r_array(int []arr) {
		int temp=arr[arr.length-1];
		for(int i=arr.length-2; i>=0; i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5};
		System.out.println("original array: "+ Arrays.toString(arr));
		for(int i=1; i<=arr.length; i++) {
			r_array(arr);
			System.out.println("rotated array for "+ i + " times: "+ Arrays.toString(arr));
		}

	}

}
