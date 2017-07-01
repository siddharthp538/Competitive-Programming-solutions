package com.siddharth;

import java.util.HashMap;
import java.util.Scanner;

public class VanyaAndPile {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<Character, Character> map = new HashMap<>();
		int n = s.nextInt();
		String str = s.next();
		char[] a = str.toCharArray();
		int count = 0;
		for (int i = 0; i < a.length; i += 2) {
			int diff = (int) (a[i + 1] - a[i]);
			if (diff == -32) {

			} else if (map.containsKey((char) ((int) a[i + 1] + 32))) {
				map.put(a[i], a[i]);
				// map.remove((char) ((int) a[i + 1] + 32));

			} else {
				count++;

				map.put(a[i], a[i]);

			}

		}
		System.out.println(count);

		s.close();
	}

}
