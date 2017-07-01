package com.siddharth;

import java.util.HashSet;
import java.util.Scanner;

public class GCGQA2016 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int caseno = 1;
		while (t-- > 0) {

			int n = s.nextInt();
			if (n == 0) {
				System.out.println("Case #" + (caseno++) + ": INSOMNIA");
			} else {
				HashSet<Long> set = new HashSet<>();

				long temp = n, i = 1;
				long size = 0;

				while (true) {
					size = getsize(temp, set);
					if (size == 10)
						break;
					i++;
					temp = i * n;

				}
				System.out.println("Case #" + (caseno++) + ": " + temp);

			}

		}
	}

	public static long getsize(long n, HashSet<Long> set) {
		while (n != 0) {
			set.add(n % 10);
			n /= 10;
		}
		return set.size();

	}

}
