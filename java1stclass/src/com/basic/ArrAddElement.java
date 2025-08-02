package com.basic;

import java.util.Arrays;

public class ArrAddElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,20,30,40,50,60,70};
		int ele=45;
		int ind=4;
		System.out.println("existing array:"+ Arrays.toString(arr));
		int [] res=new int[arr.length+1];
		for(int i=0; i<ind; i++) {
			res[i]=arr[i];
		}
		res[ind]=ele;
		for( int i=ind; i<arr.length; i++) {
			res[i+1]=arr[i];
		}
		System.out.println("modified array:" +Arrays.toString(res));

	}

}
