package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

public class Mafia {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long[] a = new long[(int) n];
		long max = Long.MIN_VALUE, sum = 0;
		for (long i = 0; i < n; i++) {
			a[(int) i] = s.nextLong();
			max = Math.max(max, a[(int) i]);
			sum += a[(int) i];
		}
		long res1 = 0, res2 = 0;
		if ((sum) % (n - 1) == 0) {
			res1 = (sum) / (n - 1);
		} else {
			res1 = (sum) / (n - 1) + 1;
		}
		if (max < res1) {
			System.out.println(res1);
		} else {
			Arrays.sort(a);
			for (long i = n - 2; i >= 1; i--) {
				res2 += max - a[(int) i];
			}
			if (res2 < a[0]) {
				max += a[0] - res2;
			}
			System.out.println(max);

		}

		s.close();
	}

}
