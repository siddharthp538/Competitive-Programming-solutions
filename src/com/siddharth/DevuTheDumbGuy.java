package com.siddharth;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class DevuTheDumbGuy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		BigInteger x = s.nextBigInteger();
		BigInteger[] a = new BigInteger[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextBigInteger();
		}
		Arrays.sort(a);

		BigInteger ans = BigInteger.ZERO;
		for (int i = 0; i < n; i++) {
			ans = ans.add(a[i].multiply(x));
			if (x.compareTo(BigInteger.ONE) > 0)
				x = x.subtract(BigInteger.ONE);
		}

		System.out.println(ans);

	}

}
