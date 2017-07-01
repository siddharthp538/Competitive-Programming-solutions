package com.siddharth;

import java.util.Scanner;

 class Nim {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			int xor = 0;
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				xor ^= a[i];
				
				
			}
			if(xor==0)
			{
				System.out.println("First");
			}
			else if(xor!=0){
				if(n%2==0)
					System.out.println("First");
				else{
					System.out.println("Second");
				}
			}
		}
	}

}
