package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

//TC
public class BuildingHieghtsEasy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		System.out.println(minimum(m, a));

	}

	public static int minimum(int M, int[] heights) {
		Arrays.sort(heights);
		int max = 0, count = 0, fmax = Integer.MAX_VALUE;
		for (int i = 0; i <= heights.length - M; i++) {
			max = heights[i + M - 1];
			for (int j = i; j < M + i; j++) {
				count += max - heights[j];
			}
			fmax = Math.min(count, fmax);
			count = 0;

		}
		return fmax;
	}

}
