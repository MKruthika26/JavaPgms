package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array: ");
		int n = sc.nextInt();	//accepts the user defined length of the array
		int [] arr= new int [n];
		System.out.println("enter "+ n +" values: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}
}
