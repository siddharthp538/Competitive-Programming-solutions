package com.siddharth;

import java.util.HashMap;
import java.util.Scanner;

public class Cf {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt(), c = s.nextInt(), d = s.nextInt();
		boolean ok = false;
		long val1 = b, val2 = d;
		HashMap<Long, Long> map = new HashMap<>();
		map.put(val1, val1);

		for (int i = 1; i <= 100; i++) {
			val1 += a;
			map.put(val1, val1);
		}
		for (int i = 1; i <= 100; i++) {
			if (map.containsKey(val2)) {
				ok = true;
				break;
			} else {
				val2 += c;
			}
		}

		System.out.println(ok ? val2 : -1);
	}

}
