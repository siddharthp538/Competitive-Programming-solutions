package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

public class Team {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ze = s.nextInt();
		int one = s.nextInt();
		int zeros = 0, count = ze;
		boolean ok = false;
		boolean specialcase = false;
		if (one % 2 == 0) {
			if (ze == (one / 2) - 1)
				specialcase = true;
			if (ze >= (one / 2) - 1)
				ok = true;
			 

		} else {
			if (ze == (one / 2))
				specialcase = true;
			if (ze >= (one / 2))
				ok = true;
			
		}
		if (ze == 1 && one == 2)
			System.out.println(110);
		else if (ze == 1 && one == 1)
			System.out.println(10);

		else if (ok) {
			String[] a = new String[(2 * one) + 1];
			for (int i = 1; i < a.length - 1; i += 2)
				a[i] = "1";
			for (int i = 0; i < a.length - 2; i += 4) {
				a[i] = "0";
				zeros++;
				if (zeros == count)
					break;

			}
			if (count > zeros) {
				for (int i = 2; i < a.length; i += 4) {
					a[i] = "0";
					zeros++;
					if (zeros == count)
						break;
				}
			}
			if (specialcase) {
				Arrays.fill(a, null);
				for (int i = 1; i < a.length - 1; i += 2)
					a[i] = "1";

				for (int i = 4; i < a.length - 1; i += 4) {
					a[i] = "0";
					zeros++;
					if (zeros == count)
						break;

				}

			}
			for (int i = 0; i < a.length; i++) {
				if (a[i] != null)
					System.out.print(a[i]);
			}

		}

		else
			System.out.println(-1);// impossible
		s.close();
	}

}
