package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

public class Passwords {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		PasswordsTimer(s);
	}

	public static void PasswordsTimer(Scanner s) {
		int n = s.nextInt();
		int k = s.nextInt();
		long bc = 0, count = 0, wc = 0;
		String[] a = new String[n];
		int[] size = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.next();
			size[i] = a[i].length();
		}
		String pass = s.next();
		Arrays.sort(size);
		for (int i = 0; i < n; i++) {
			if (size[i] == pass.length()) {
				count++;
				break;
			} else
				count++;
		}
		int j = 0, count1 = 0;
		while (pass.length() >= size[j]) {
			j++;
			count1++;
			if (j == n)
				break;

		}
		if (count == k && a.length == count) {
			System.out.println(count + " " + count);
		} else if (count == k && a.length != count && count1 % k != 0) {
			System.out.println(count + " " + (((count1 / k) * 5) + ((count1 / k) * (k)) + (count1 % k)));
		} else {
			if (count % k == 0) {
				bc = count + 5 * ((count / k) - 1);
			} else {
				bc = ((count / k) * 5) + ((count / k) * (k)) + count % k;
			}
			if (count1 % k == 0) {
				wc = count1 + 5 * ((count1 / k) - 1);
			} else {
				wc = ((count1 / k) * 5) + ((count1 / k) * (k)) + (count1 % k);
			}

			System.out.println(bc + " " + wc);
		}
	}
}
