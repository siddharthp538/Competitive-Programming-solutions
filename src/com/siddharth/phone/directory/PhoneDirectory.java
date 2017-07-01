package com.siddharth.phone.directory;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneDirectory {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();

		}
		for (int i = 0; i < n; i++) {
			b[i] = s.nextInt();
			map.put(b[i], i);
		}
		int lowestindex = 100000;
		int lowestval = 0;
		for (int i = 0; i < n; i++) {
			int val = Math.abs(i - (map.get(a[i])));
			if (val == lowestindex) {
				lowestval = Math.min(lowestval, a[i]);
				lowestindex = val;
			} else if (val < lowestindex) {
				lowestindex = val;
				lowestval = a[i];

			}

		}
		System.out.println(lowestval);
		s.close();

	}
}
