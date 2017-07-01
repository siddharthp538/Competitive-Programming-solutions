package com.siddharth;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class NonDivisibleSet {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] a = new int[n];
		SortedSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			set.add(a[i] % m);
		}

	}

}
