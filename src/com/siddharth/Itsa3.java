package com.siddharth;

import java.util.Scanner;

public class Itsa3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[] a = new int[1000000];
		// Arrays.fill(a, 0);
		while (t-- > 0) {

			char c = s.next().charAt(0);
			if (c == 'U') {
				int pos = s.nextInt(), m = s.nextInt(), plus = s.nextInt();
				Update(pos, m, plus, a);

			} else {
				int count = 0;
				int l = s.nextInt(), r = s.nextInt();
				for (int i = l; i <= r; i++) {
					count += a[i];
				}
				System.out.println(count);
			}

		}
	}

	static void Update(int pos, int M, int plus, int[] a) {
		int N = 1000000; // 1 million
		for (int i = 1; i <= 50; i++) {
			int back = pos;
			for (int j = 1; j <= 1000; j++) {
				// add M water ballons at bucket pos;
				a[pos] += M;
				int s, in = Integer.bitCount(pos);
				for (int k = 0;; k++) {
					s = pos + (int) Math.pow(2, k);
					if (Integer.bitCount(s) <= in) {
						in = Integer.bitCount(s);
						pos = s;
						if (pos > N)
							break;
						// add M water ballons at bucket pos
						a[pos] += M;
					}
				}
				pos = pos - N;
			}
			pos = back + plus;
			if (pos > N)
				pos -= N;
		}
	}

}
