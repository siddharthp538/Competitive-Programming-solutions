package com.siddharth;

import java.util.Scanner;

class DGTCNT {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			long l = s.nextLong(), r = s.nextLong();

			long[] a = new long[10];
			boolean ok = false;
			for (int i = 0; i < 10; i++) {
				a[i] = s.nextInt();
				if (a[i] != 0)
					ok = true;

			}
			long count = 0;
			if (!ok) {
				for (long i = l; i <= r; i++) {
					if (i < 1023456789) {
						count++;
						continue;
					}
					long n = i;

					long[] ans = new long[10];
					while (n != 0) {

						ans[(int) (n % 10)]++;
						n /= 10;
					}

					for (long j = 0; j < 10; j++) {
						if (ans[(int) j] == a[(int) j]) {
							count++;
							break;
						}
					}
				}
				System.out.println(r - l + 1 - count);
				continue;

			}

			for (long i = l; i <= r; i++) {

				long n = i;

				long[] ans = new long[10];
				while (n != 0) {

					ans[(int) (n % 10)]++;
					n /= 10;
				}

				for (long j = 0; j < 10; j++) {
					if (ans[(int) j] == a[(int) j]) {
						count++;
						break;
					}
				}
			}
			System.out.println(r - l + 1 - count);
		}
	}

}