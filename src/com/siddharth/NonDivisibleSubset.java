package com.siddharth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class NonDivisibleSubset {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] a = new int[n];
		int[] mod = new int[n];
		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> map1 = new HashMap<>();
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			mod[i] = a[i] % m;
		}
		ArrayList<Integer> ar = new ArrayList<>();
		Arrays.sort(mod);
		int count = 1, max = mod[mod.length - 1];
		for (int i = 0; i < n - 1; i++) {
			if (mod[i] == mod[i + 1])
				count++;
			else if (mod[i] != mod[i + 1]) {
				ar.add(mod[i]);
				map.put(mod[i], count);
				count = 1;
			}
		}
		map.put(mod[mod.length - 1], count);
		if (ar.size() > 0 && ar.get(ar.size() - 1) != max) {
			ar.add(max);
		} else if (ar.size() == 0)
			ar.add(mod[0]);
		int ans = Integer.MIN_VALUE;
		boolean val = false;
		count = 0;
		for (int i = 0; i < ar.size(); i++) {
			map1.clear();
			for (int j = i; j < ar.size(); j++) {
				if (!map1.containsKey(m - ar.get(j)) && (m - ar.get(j)) % m != 0) {
					map1.put(ar.get(j), ar.get(j));
					if (ar.get(j) != 0) {
						count += map.get(ar.get(j));
					} else if ((ar.get(j) == 0) && !val) {
						count += 1;
						val = !val;
					}
				}
			}
			ans = Math.max(count, ans);
			count = 0;
		}
		System.out.println(ans);
	}
}
