package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

class SETDIFF {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	}

	public void Answer(Scanner s) {
		int t = s.nextInt();
		while (t-- > 0) {
			long n = s.nextLong();
			long[] a = new long[(int) n];
			// TakeArrayInput(a, s);
			long max = 0;
			for (long i = 0; i < n; i++) {
				a[(int) i] = s.nextInt();
				max += a[(int) i];
			}
			

		}
	}

}
