package com.siddharthapril17;

import java.util.HashMap;
import java.util.Scanner;

public class AccSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		solve(s);

	}

	public static void solve(Scanner s) {
		String str = s.next();
		char[] a = str.toCharArray();
		boolean ok = true, ok1 = true;
		HashMap<Character, Character> map = new HashMap<>();
		map.put('a', 'a');
		map.put('e', 'e');
		map.put('i', 'i');
		map.put('o', 'o');
		map.put('u', 'u');
		map.put('y', 'y');
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				ok = false;
				break;
			} else if (map.containsKey(a[i]) && map.containsKey(a[i + 1])
					|| map.containsKey(a[i + 1]) && map.containsKey(a[i])) {
				ok1 = false;
				break;

			}

		}
		System.out.println(ok && ok1 ? "Yes" : "No");

	}

}
