package com.siddharth;

import java.util.Scanner;

class FebLong2017Q3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int o1 = s.nextInt(), o2 = s.nextInt();
			int[] districts = new int[o1 * o2];
			int[] sum = new int[(o1 * o2) + 1];
			for (int i = 0; i < districts.length; i++) {
				districts[i] = s.nextInt();
				sum[i + 1] += districts[i] + sum[i];
			}
			boolean ok = false;
			for (int i = 0; i < o2; i++) {
				if (calculate(sum, districts, i, o2, o1)) {
					ok = !ok;
					break;
				}
			}
			if (ok)
				System.out.println(1);
			else
				System.out.println(0);

		}
	}

	public static boolean calculate(int[] sum, int[] og, int index, int o2, int o1) {
		int k = o2 + index, sum1 = 0, m = o2, o = 0, z = 0, initial = index;
		for (int i = index; i < og.length; i += o2) {
			if (i + o2 > og.length)
				break;
			sum1 = sum[k] - sum[i];
			k += m;
			if (sum1 >= (m / 2) + 1) {
				o++;
			} else
				z++;
		}
		sum1 = 0;
		if (initial != 0) {
			for (int i = initial - 1; i >= 0; i--) {
				sum1 += og[i];
			}
			for (int i = (o2 * o1) - o2 + initial; i < og.length; i++) {
				sum1 += og[i];
			}
			if (sum1 >= (m / 2) + 1)
				o++;
			else
				z++;

		}
		if (o > z)
			return true;

		return false;
	}

}
