package com.basic;

public class Arr2D {
	public static void printarr(int [][]arr) {
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][3];
		int k=1;
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j]=k;
				k++;
			}
		}
		printarr(arr);

	}

}
