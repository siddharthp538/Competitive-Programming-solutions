package com.siddharth;

import java.util.HashMap;
import java.util.Scanner;

public class SerejaSuffixes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			int n = s.nextInt(), m = s.nextInt();
			int[] a = new int[n];
			HashMap<Integer, Integer> map = new HashMap<>();
			HashMap<Integer, Integer> map2 = new HashMap<>();
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			int count =0;
			for (int i = n - 1; i >= 0; i--) {
				if (!map2.containsKey(a[i])) {
					count++;
					map.put(i + 1, count);
				} else {
					map.put(i + 1, count);
				}
				map2.put(a[i], a[i]);
			}
			while (m-- > 0) {
				int x = s.nextInt();
				System.out.println(map.get(x));
			}

	}

}
