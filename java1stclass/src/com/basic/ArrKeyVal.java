package com.basic;

public class ArrKeyVal {
	public static int ls(int arr[], int key) {
		for(int i=0; i<arr.length; i++) {
			if(key==arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,53,64,57,33,98,87};
		int key=33;
		int val=ls(arr,key);
		if(val==-1) {
			System.out.println("key value not found");
		}else {
			System.out.println("key found in Array index:"+val);
		}
		
	}

}
