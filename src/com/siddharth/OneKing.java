package com.siddharth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class OneKing {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();

			ArrayList<Integer> store = new ArrayList<>();
			HashMap<Integer, Integer> map = new HashMap<>();
			while (n-- > 0) {
				int a = s.nextInt();
				int b = s.nextInt();
				store.add(a);
				map.put(a, b);
			}
			Collections.sort(store);
			int c = 1, k = map.get(store.get(0));
			for (int i = 1; i < store.size(); i++) {
				if (k < store.get(i) ) {
					c++;
					k = map.get(store.get(i));
				}
			}
			System.out.println(c);
			

		}

	}

}
