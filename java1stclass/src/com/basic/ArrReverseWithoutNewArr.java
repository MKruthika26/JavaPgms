package com.basic;

import java.util.Arrays;

public class ArrReverseWithoutNewArr {
	public static int [] b_sort(int res[]) {
		for(int i=0; i<res.length; i++) {
			for(int k=0; k<res.length-1; k++) {
				if(res[k]>res[k+1]) {
					int temp=res[k];
					res[k]=res[k+1];
					res[k+1]=temp;
				}
			}
		}
		return res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {12,64,78,9,81,34,70,23};
		 int start = 0;
		 int end = arr.length-1;
		 while(start<=end) {
			 int temp=arr[start];
			 arr[start]=arr[end];
			 arr[end]=temp;
			 start++;
			 end--;
		 }
		 System.out.println(Arrays.toString(arr));
	}

}
