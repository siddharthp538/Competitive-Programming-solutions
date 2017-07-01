package com.siddharth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OneBomb {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		// char[] bombs = new char[m];
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		char[] bombs = new char[m];
		for (int i = 0; i < n; i++) {
			String str = s.next();
			bombs = str.toCharArray();
			for (int j = 0; j < m; j++) {
				if (bombs[j] == '*') {
					a.add(i + 1);// rows ..*
					// .*.
					// *..
					b.add(j + 1);// columns

				}
			}
		}
		ArrayList<Integer> c = new ArrayList<>(a);
		ArrayList<Integer> d = new ArrayList<>(b);
		Collections.sort(a);
		Collections.sort(b);
		int rmax = 0, cmax = 0, count = 1, rel = 0, cel = 0;
		for (int i = 0; i < a.size() - 1; i++) {
			if (a.get(i) == a.get(i + 1)) {
				count++;
			} else {
				if (count > rmax) {
					rmax = count;
					rel = a.get(i);
				}
				count = 1;
			}

		}
		if (count > rmax) {
			rmax = count;
			rel = a.get(a.size() - 1);
		}
		count = 1;
		for (int i = 0; i < b.size() - 1; i++) {
			if (b.get(i) == b.get(i + 1)) {
				count++;
			} else {
				if (count > rmax) {
					cmax = count;
					cel = b.get(i);
				}
				count = 1;
			}

		}
		if (count > cmax) {
			cmax = count;
			cel = b.get(b.size() - 1);
		}
		count = 1;
		boolean ok = true;
		for (int i = 0; i < a.size(); i++) {
			if (c.get(i) == rel || c.get(i) == cel || d.get(i) == rel || d.get(i) == cel) {

			} else {
				ok = false;
				break;
			}
		}
		if (ok) {
			System.out.println("YES");
			System.out.print(rel + " " + cel);
		} else
			System.out.println("NO");

	}

}
