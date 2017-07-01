package com.siddharthapril17;

import java.util.Scanner;

class ACook81 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			long a = s.nextLong(), b = s.nextLong();
			long sum_even = 0, odd_sum = 0;
			boolean ok = true;
			for (long i = 1; i <= 1000; i++) {
				odd_sum = i * i;
				if (odd_sum > a) {
					ok = false;
					break;
				}
				sum_even = i * (i + 1);
				if (sum_even > b)

					break;

			}
			System.out.println(ok ? "Limak" : "Bob");
		}
	}

}
