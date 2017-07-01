package com.siddharthapril17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxAndSub {
	static ArrayList<Long> A = new ArrayList<>();

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		long k = s.nextLong();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextLong();
		}
		boolean[] marked = new boolean[n];
		Arrays.sort(a);
		for (int i = 0; i <= a.length - k; i++) {
			long ans = a[i];
			for (int j = i; j < k + i; j++) {
				ans &= a[j];
			}
			A.add(ans);

		}

		long max = Integer.MIN_VALUE;
		for (int i = 0; i < A.size(); i++)
			max = Math.max(max, A.get(i));
		int count = 0;
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) == max)
				count++;
		}
		System.out.println(max + "\n" + count);
	}

	static void seq(long[] a, long k, int s, int len, boolean[] marked) {
		if (len == k) {
			long ans = 1;
			int j;
			for (j = 0; j < a.length; j++) {
				if (marked[j])
					System.out.print(a[j] + " ");
			}

			for (j = 0; j < a.length; j++) {
				if (marked[j]) {
					ans = a[j];
					break;

				}
			}
			for (int i = j; i < a.length; i++) {
				if (marked[i])
					ans = ans & a[i];

			}
			System.out.print(ans);
			System.out.println();
			return;
		}
		if (s == a.length)
			return;
		marked[s] = true;
		seq(a, k, s + 1, len + 1, marked);
		marked[s] = false;
		seq(a, k, s + 1, len, marked);

	}

}
