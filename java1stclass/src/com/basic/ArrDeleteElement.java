package com.basic;

import java.util.Arrays;

public class ArrDeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ind=4;
		int []arr= {10,20,30,40,50,60,70};
		System.out.println("existing array:"+ Arrays.toString(arr));
		int res[]=new int[arr.length-1];
		for(int i=0; i<ind; i++) {
			res[i]=arr[i];
		}
		for(int i=ind+1; i<arr.length; i++) {
			res[i-1]=arr[i];
		}
		System.out.println("modified array:" +Arrays.toString(res));
		
	}

}
