package com.siddharth;

import java.util.Scanner;

public class WorldTheatre {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int j = s.nextInt();
		int k = s.nextInt();
		int diff = 0, rev = 0, c = 0, rem = 0;
		for (int n = i; n <= j; n++) {
			int b = n;
			while (b != 0) {
				rem = b % 10;
				rev = rev * 10 + rem;
				b = b / 10;

			}
			diff = Math.abs(rev - n);
			if(diff%k==0) 
				c++;
			rev=0;

		}
		System.out.println(c);
	}
}
