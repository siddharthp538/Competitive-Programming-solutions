package com.siddharth;

import java.math.BigInteger;
import java.util.Scanner;

public class OlyesaAndRadon {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("1");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int t = s.nextInt();
		if (a == 1 && t == 10) {
			System.out.println(-1);
		} else {
			for (int i = 0; i < a - 1; i++) {
				str = str.append("0");
			}
			String str1 = str.toString();
			BigInteger m = new BigInteger(Integer.toString(t));
			BigInteger num = new BigInteger(str1);
			int k = 0;
			boolean done = false;
			while (k < 10) {
				k++;
				if (num.mod(m) == BigInteger.ZERO) {
					done = true;
					break;
				} else
					num = num.add(BigInteger.ONE);

			}
			if (!done)
				System.out.println(-1);
			else
				System.out.println(num);

		}
	}

}
