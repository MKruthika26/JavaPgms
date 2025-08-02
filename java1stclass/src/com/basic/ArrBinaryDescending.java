package com.basic;

public class ArrBinaryDescending {
	public static int bs(int []arr, int key) {
		int low=0;
		int high=arr.length-1;
		while (low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(key>arr[mid]) {
				high=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {95,58,26,11,10,5,3};
		int key=26;
		int val=bs(arr,key);
		if(val==-1) {
			System.out.println("element not found");
		}else {
			System.out.println("element found at array index: "+val);
		}

	}

}
