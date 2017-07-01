package com.siddharth;

import java.util.HashMap;
import java.util.Scanner;

public class GeomDepression {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long b1 = s.nextLong(), q = s.nextLong(), l = s.nextLong();
		int m = s.nextInt();
		long[] a = new long[m];
		HashMap<Long, Long> map = new HashMap<>();
		for (int i = 0; i < m; i++) {
			a[i] = s.nextInt();
			map.put(a[i], a[i]);
		}
		if (Math.abs(b1) > l)
			System.out.println(0);
		else if (q == -1) {
			if (map.containsKey(b1) && map.containsKey(-b1))
				System.out.println(0);
			else {
				System.out.println("inf");
			}
		} else if (b1 == 0) {
			if (map.containsKey(b1)) {
				System.out.println(0);
			} else {
				System.out.println("inf");
			}
		} else if (q == 0) {
			if (!map.containsKey(q)) {
				System.out.println("inf");
			} else if (map.containsKey(b1)) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}

		} else if (q == 1) {
			if (map.containsKey(b1)) {
				System.out.println("0");
			} else {
				System.out.println("inf");
			}

		} else {
			long count = 0;
			while (Math.abs(b1) <= l) {
				if (!map.containsKey(b1))
					count++;
				b1 *= q;
			}
			System.out.println(count);

		}

	}

}