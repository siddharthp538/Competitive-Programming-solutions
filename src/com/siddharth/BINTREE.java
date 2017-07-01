package com.siddharth;

import java.util.Scanner;

class BINTREE {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long t = s.nextLong(), count = 0;
		while (t-- > 0) {
			count = 0;
			long n1 = s.nextLong();
			long n2 = s.nextLong();
			if (n1 == n2)
				System.out.println(0);

			else {
				long x = logOfBase(Math.max(n1, n2));
				long y = logOfBase(Math.min(n1, n2));
				long max = Math.max(n1, n2), min = Math.min(n1, n2);
				long iter = Math.abs(x - y);
				;
				while (iter-- > 0) {
					max = max / 2;
					count++;
				}
				if (max == min)
					System.out.println(count);
				else {
					while (max >= 1 && min >= 1) {
						if (Math.abs(max - min) == 1 && (max / 2) == (min / 2)) {

							count += 2;
							break;
						} else {
							count += 2;
							max /= 2;
							min /= 2;
						}
					}
					System.out.println(count);
				}
			}
		}
		s.close();

	}

	public static long logOfBase(long num) {
		return (long) (Math.log(num) / Math.log(2));
	}
}
