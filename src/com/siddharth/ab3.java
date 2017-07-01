package com.siddharth;

import java.util.HashMap;
import java.util.Scanner;

class ab3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int k = s.nextInt();
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = s.nextLong();
			int count = 0;
			long[] mod = new long[n];
			HashMap<Long, Long> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				mod[i] = a[i] % k;
				map.put(mod[i], mod[i]);
			}
			

		}
	}

}
