package com.basic;

public class ArrBinarySearch {
	public static int bs(int []arr, int key) {
		int low=0;
		int high=arr.length-1;
		while (low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(key>arr[mid]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,53,64,67,73,98};
		int key=53;
		int val=bs(arr,key);
		if(val==-1) {
			System.out.println("element not found");
		}else {
			System.out.println("element found at array index: "+val);
		}

	}

}
