package com.siddharth;

import java.util.HashMap;
import java.util.Scanner;

public class traitor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong(), m = s.nextLong();
		boolean ok = false, done = false;
		HashMap<Integer, Integer> map = new HashMap<>();
		while (m-- > 0) {
			ok = true;
			map.clear();
			int a = s.nextInt();
			int[] a1 = new int[a];

			for (int i = 0; i < a; i++) {
				a1[i] = s.nextInt();
				map.put(a1[i], a1[i]);
			}
			for (int i = 0; i < a; i++) {
				if (map.containsKey(-a1[i])) {
					ok = false;
					break;
				}
			}
			if (ok)
				done = true;

		}
		System.out.println(done ? "YES" : "NO");
	}

}
