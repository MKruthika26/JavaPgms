package com.basic;

public class Arr2arrequalornot {
	public static boolean check_array(int []arr,int []res) {
		if(arr.length != res.length) {
			return false;
		}
		for (int i=0; i<arr.length; i++) {
			if(arr[i] != res[i]) {
				return false;
			}
		}
		return true;
	}
			public static void main(String[] args) {
			// TODO Auto-generated method stub
			int []arr= {1,2,3,4,5};
			int res[]= {1,2,3,4,5};
			System.out.println(check_array(arr,res));
			
		}

}
