package com.siddharth;

import java.util.HashMap;
import java.util.Scanner;

class Similar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			HashMap<String, String> map = new HashMap<>();
			String[] a = new String[4];
			for (int i = 0; i < 4; i++) {
				a[i] = s.next();
				map.put(a[i], a[i]);
			}
			int c = 0;
			for (int i = 0; i < 4; i++) {
				if (map.containsKey(s.next()))

					c++;
			}
			System.out.println(c >= 2 ? "similar" : "dissimilar");

		}
	}

}
