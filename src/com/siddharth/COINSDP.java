package com.siddharth;

import java.util.HashMap;
import java.util.Scanner;

class COINSDP {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			long n = s.nextLong();
			HashMap<Long, Long> memo = new HashMap<>();
			calculate(n, memo);
			//int a[]=new int[1000000000];
			//System.out.println(a[0]);
			
			
			System.out.println(memo.get(n));

		}

	}

	public static long calculate(long n, HashMap<Long, Long> memo) {
		// basecase
		if (n <= 3) {
			memo.put(n, n);
			return n;
		}
		if (!memo.containsKey(n)) {
			long t1 = calculate(n / 2, memo);
			long t2 = calculate(n / 3, memo);
			long t3 = calculate(n / 4, memo);

			long sum = t1 + t2 + t3;

			if (sum > n) {

				memo.put(n, sum);
			} else {
				memo.put(n, n);
			}

		}
		return memo.get(n);

	}

}
