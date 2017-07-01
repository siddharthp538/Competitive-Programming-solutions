package com.siddharth;

import java.util.ArrayList;
import java.util.Scanner;

class Cook792 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String str = s.next();
			char[] a = str.toCharArray();
			char[] b = new char[a.length * 2];
			int c = 0, j = 0;
			ArrayList<Integer> pos = new ArrayList<>();
			for (int i = 0; i < a.length; i++) {
				b[i] = a[i];
				b[i+a.length]=a[i];
				if (a[i] == '1') {
					c++;
					pos.add(i);

				}
			}
			

			j = 0;

			int k = c, ans = 0, max = Integer.MAX_VALUE, index = 0;
			j = 0;
			for (int i = 0; i < pos.size(); i++) {
				j = pos.get(i);
				while (true) {
					if (b[j] == '0') {
						ans++;
					} else {
						index++;
					}
					if (index == c) {
						break;
					}
					j++;
				}
				max = Math.min(max, ans);
				ans = 0;
				index = 0;
			}
			System.out.println(max);

		}
	}

}
