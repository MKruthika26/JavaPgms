package com.basic;

import java.util.Arrays;

public class ArrElementMoveFromLeftToRight {
	public static void r_array(int []arr) {
		int temp=arr[0];
		for(int i=1; i<arr.length; i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,45,56,7,68,79,80};
		r_array(arr);
		System.out.println(Arrays.toString(arr));

	}

}
