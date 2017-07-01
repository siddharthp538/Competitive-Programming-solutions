package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

class ChefAndTriangles {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		Interval arr[] = new Interval[n - 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Interval(0, 0);

		}
		Arrays.sort(a);
		for (int i = 1; i < n; i++) {
			arr[i - 1].start = a[i] - a[i - 1] + 1;
			arr[i - 1].end = a[i] + a[i - 1] - 1;
		}
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++) {
			System.out.print("{" + arr[i].start + " , " + arr[i].end + "} ");
		}

	}

}

class Interval {
	int start, end;

	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}