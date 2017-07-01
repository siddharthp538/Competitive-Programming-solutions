package com.siddharth;

import java.util.Scanner;

public class Game24 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong(), temp = 0, zeros = 0;

		if (n <= 3)
			System.out.println("NO");
		else {
			System.out.println("YES");
			if (n % 2 == 0) {
				if (n % 4 == 0) {
					while (n > 4) {
						System.out.println(n + " - " + (--n) + " = 1 ");
						n--;
						temp++;
						if (temp == 2) {
							System.out.println("1 - 1 = 0 ");
							zeros++;
							temp = 0;
						}
					}
					while (zeros-- > 0) {
						System.out.println("4 - 0 = 4 ");
					}
					System.out.println("1 + 3 = 4 ");
					System.out.println("2 + 4 = 6 ");
					System.out.println("6 * 4 = 24");
				} else {
					temp = 1;
					while (n > 4) {
						System.out.println(n + " - " + (--n) + " = 1 ");
						n--;
						temp++;

					}
					zeros = temp / 2;
					temp /= 2;
					while (temp-- > 0) {
						System.out.println("1 - 1 = 0");
					}
					while (zeros-- > 0) {
						System.out.println("4 - 0 = 4");
					}

					System.out.println("2 * 3 = 6 ");
					System.out.println("4 * 6 = 24");
				}
			} else {

				if (n % 4 == 3) {
					while (n > 7) {
						System.out.println(n + " - " + (--n) + " = 1 ");
						n--;
						temp++;

					}
					zeros = temp / 2;
					temp /= 2;
					while (temp-- > 0) {
						System.out.println("1 - 1 = 0");
					}
					while (zeros-- > 0) {
						System.out.println("7 - 0 = 7");
					}
					System.out.println("5 - 2 = 3");
					System.out.println("7 - 4 = 3");
					System.out.println("3 - 3 = 0 ");
					System.out.println("6 - 0 = 6");
					System.out.println("1 + 3 = 4");
					System.out.println("6 * 4 = 24");

				} else if (n % 4 == 1) {

					while (n > 5) {
						System.out.println(n + " - " + (--n) + " = 1 ");
						n--;
						temp++;

					}
					zeros = temp / 2;
					temp /= 2;
					while (temp-- > 0) {
						System.out.println("1 - 1 = 0");
					}
					while (zeros-- > 0) {
						System.out.println("5 - 0 = 5");
					}
					System.out.println("5 - 2 = 3");
					System.out.println("3 - 1 = 2");
					System.out.println("4 * 2 = 8 ");
					System.out.println("8 * 3 = 24 ");

				}

			}
		}
		s.close();
	}

}