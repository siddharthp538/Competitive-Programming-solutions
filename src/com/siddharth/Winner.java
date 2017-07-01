package com.siddharth;

import java.util.HashMap;
import java.util.Scanner;

public class Winner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		int max = Integer.MIN_VALUE;
		String ans = " ";
		while (t-- > 0) {
			String str = s.next();
			int val = s.nextInt();
			if (!map.containsKey(str)) {
				map.put(str, val);
			} else {
				map.put(str, val + map.get(str));
			}
			if (map.get(str) > max) {
				ans = str;
				max = map.get(str);

			}
		}
		System.out.println(ans);
	}
}
