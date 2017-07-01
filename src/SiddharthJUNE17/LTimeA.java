package SiddharthJUNE17;

import java.util.Scanner;

class LTimeA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			long a = s.nextLong(), b = s.nextLong(), n = s.nextLong();
			if (n % 2 == 0) {
				System.out.println(Math.max(a, b) / Math.min(a, b));
			} else {
				if (b > 2 * a) {
					System.out.println(b / (2 * a));
				} else {
					System.out.println((a * 2) / b);
				}
			}
		}

	}

}