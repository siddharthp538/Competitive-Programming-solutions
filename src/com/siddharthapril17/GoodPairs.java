package com.siddharthapril17;

import java.util.HashMap;
import java.util.Scanner;

class GoodPairs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String str1 = s.next();
			int len = s.nextInt();
			String str2 = s.next();
			char[] a = str2.toCharArray();
			HashMap<Character, Integer> map = new HashMap<>();
			for (int i = 0; i < len; i++) {
				if (map.containsKey(a[i]))
					map.put(a[i], map.get(a[i]) + 1);
				else
					map.put(a[i], 1);

			}
			long ans = 0;
			for (int i = 0; i < n; i++) {
				if (map.containsKey(str1.charAt(i))) {
					ans += len - map.get(str1.charAt(i));
				} else {
					ans += len;
				}

			}
			System.out.println(ans);

		}
	}

}
