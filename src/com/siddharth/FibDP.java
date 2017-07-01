package com.siddharth;

import java.util.Scanner;

public class FibDP {
	static int max = 40, nil = -1;
	static int[] a = new int[max];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		FibDP obj = new FibDP();
		obj.initialise(a);
		// System.out.println(obj.fib(s.nextInt()));

		// long n=s.nextLong();
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int n = s.nextInt();
			if (n == 1) {
				System.out.println(b);
			} else if (n == 0)
				System.out.println(a);
			else {

				long[] fib = new long[n + 1];
				fib[0] = a;
				fib[1] = b;

				for (int i = 2; i < fib.length; i++) {
					fib[i] = fib[i - 1] + fib[i - 2];
				}
				System.out.println(fib[n]);
			}

		}
	}

	int fib(int n) {
		if (a[n] == nil) {
			if (n == 1 || n == 0)
				a[n] = n;
			else
				a[n] = fib(n - 1) + fib(n - 2);
		}
		return a[n];
	}

	void initialise(int[] a) {
		for (int i = 0; i < max; i++)
			a[i] = nil;
	}
}
