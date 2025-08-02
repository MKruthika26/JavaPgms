package com.basic;

public class ThirdVarFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=5;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1; i<=rows; i++) {
			int k=1;
			for(int j=1; j<=i; j++) {
				System.out.print(k +" ");
				k++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1; i<=rows; i++) {
			int k=5;
			for(int j=1; j<=i; j++) {
				System.out.print(k +" ");
				k--;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1; i<=rows; i++) {
			int k=rows+1-i;
			for(int j=1; j<=i; j++) {
				System.out.print(k +" ");
				k++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		int k=1;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(k +" ");
				k++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		int a=1;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(a % 2 +" ");
				a++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		int b=0;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(b % 2 +" ");
				b++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for (int i=1; i<=rows; i++) {
			int x=i;
			for(int j=1; j<= i; j++) {
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for (int i=1; i<=rows; i++) {
			int x=i;
			for(int j=i; j<= 2*i-1; j++) {
				System.out.print(x % 2 +" ");
				x++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for (int i=1; i<=rows; i++) {
			int x=i-1;
			for(int j=i; j<= 2*i-1; j++) {
				System.out.print(x % 2+" ");
				x++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		int x=1;
		for (int i=1; i<=rows; i++) {
			for(int j=1; j<= i; j++) {
				System.out.print(x+" ");
				x++;
				if(x==5) {
					x=0;
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		int c=1;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(c%5 +" ");
				c++;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int d=1;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				if(d%2==0) {
				System.out.print((char)(96+d) +" ");
				}else {
					System.out.print((char)(64+d) +" ");
				}
				d++;
			}
			System.out.println();
		}

	}

}
