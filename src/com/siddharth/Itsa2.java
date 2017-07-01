package com.siddharth;

import java.util.Scanner;

public class Itsa2 {
	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			long x1 = s.nextLong(), y1 = s.nextLong(), x2 = s.nextLong(), y2 = s.nextLong(), bx = 0, by = 0;
			long x = (x2 - x1), y = (y2 - y1);
			long gcd = gcd(Math.abs(x), Math.abs(y));
			x /= gcd;
			y /= gcd;
			long xsum = x1 + y1, ysum = x2 + y2;
			long count = 0;
			double og = 0, dis = 0;
			og = caldis(x1, y1, x2, y2);
			if (xsum > ysum) {
				bx = x2;
				by = y2;

				x2 += x;
				y2 += y;
				dis = caldis(bx, by, x2, y2);
				while (dis < og) {
					count++;
					x2 += x;
					y2 += y;
					dis = caldis(bx, by, x2, y2);

				}
			} else {
				bx = x1;
				by = y1;
				x1 += x;
				y1 += y;
				dis = caldis(bx, by, x1, y1);
				// dis = caldis(x, y, x1, y1);
				while (dis < og) {
					count++;
					x1 += x;
					y1 += y;
					dis = caldis(bx, by, x1, y1);

				}

			}
			System.out.println(count);

		}
	}

	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static double caldis(long x1, long y1, long x2, long y2) {
		return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}

}
