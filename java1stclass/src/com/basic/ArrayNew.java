package com.basic;

import java.util.Arrays;

public class ArrayNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[5];
		System.out.println("address of Array: "+arr); //prints address
		System.out.println("Array elements: ");
		for (int i=0; i< arr.length; i++) {
			System.out.println(arr[i]); //prints array elements
		}
		System.out.println("Array: "+Arrays.toString(arr)); //prints whole array

	}

}
