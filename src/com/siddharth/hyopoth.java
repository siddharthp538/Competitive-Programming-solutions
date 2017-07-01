package com.siddharth;

import java.util.Scanner;

public class hyopoth {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (Prime(n)) {
			System.out.println(1 + "\n" + n);

		} else if (Prime(n - 2)) {
			System.out.println(2 + "\n" + "2 " + (n - 2));

		} else if (Prime(n - 4)) {
			System.out.println(3 + "\n" + "2 2 " + (n - 4));
		} else if (Prime(n - 6))
			System.out.println(3 + "\n" + "3 3 " + (n - 6));
		else if (Prime(n - 8))
			System.out.println(3 + "\n" + "3 5 " + (n - 8));
		else if (Prime(n - 10))
			System.out.println(3 + "\n" + "5 5 " + (n - 10));
		else {
			int k = 10;
			for (int i = n - 12; i >= 3; i -= 2) {
				k += 2;
				if (Prime(i) && Prime((k) / 2)) {
					System.out.println(3 + "\n" + (i) + " " + k / 2 + " " + k / 2);
					break;
				}
			}

		}

	}

	public static boolean Prime(int n) {
		if (n < 1)
			return false;
		if (n % 2 == 0)
			return n == 2;
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
