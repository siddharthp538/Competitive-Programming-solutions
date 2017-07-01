package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

public class Kangaroos {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		Arrays.sort(a);
        calculateKangaroos(a);
		s.close();
      }

	private static void calculateKangaroos(int[] a) {
		int p1 = 0, p2 = a.length / 2, c = 0;
		if (a.length % 2 == 0) {
			while (p2 < a.length) {
				if (2 * a[p1] <= a[p2]) {
					p1++;
					c++;
				} else if ((2 * a[p1]) > a[p2]) {
					c++;
				} else {				
					c++;
				}
				p2++;
			}
			c += Math.abs((a.length / 2) - p1) + (Math.abs(a.length - p2));
			System.out.println(c);
		} else {
			while (p2 < a.length && p1 <= a.length / 2 - 1) {

				if (2 * a[p1] <= a[p2]) {
					p1++;

					c++;
				} else if ((2 * a[p1]) > a[p2]) {

					c++;
				} else {

					c++;
				}
				p2++;

			}
			c += Math.abs((a.length / 2) - p1) + (Math.abs(a.length - p2));
			System.out.println(c);
		}
	}

}
