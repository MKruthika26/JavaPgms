package com.basic;

import java.util.Arrays;

public class BubbleSortDescending {
		public static void b_sort(int arr[]) {
			for(int i=0; i<arr.length; i++) {
				for(int k=0; k<arr.length-1; k++) {
					if(arr[k]<arr[k+1]) {
						int temp=arr[k];
						arr[k]=arr[k+1];
						arr[k+1]=temp;
					}
				}
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 int arr[]= {12,64,78,9,81,34,70,23};
			 b_sort(arr);
			 System.out.println(Arrays.toString(arr));

		}
}
