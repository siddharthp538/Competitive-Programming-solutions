package SiddharthMay17;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class CHEFCODE {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		BigInteger k = s.nextBigInteger();
		BigInteger[] a = new BigInteger[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextBigInteger();

		BigInteger[] b = new BigInteger[n / 2];
		BigInteger[] c = new BigInteger[n - (n / 2)];
		for (int i = 0; i < n / 2; i++)
			b[i] = a[i];
		int j = 0;
		for (int i = n / 2; i < n; i++)
			c[j++] = a[i];
		int up = 1 << (n / 2);
		ArrayList<BigInteger> subset1 = new ArrayList<>();
		ArrayList<BigInteger> subset2 = new ArrayList<>();
		for (int i = 0; i < up; i++) {
			BigInteger prod = BigInteger.ONE;
			for (j = 0; j < n / 2; j++)
				if ((i & (1 << j)) != 0)
					prod = prod.multiply(b[j]);
			if (prod.compareTo(k) <= 0)
				subset1.add(prod);

		}
		up = 1 << (c.length);
		for (int i = 0; i < up; i++) {
			BigInteger prod = BigInteger.ONE;
			for (j = 0; j < (c.length); j++)
				if ((i & (1 << j)) != 0)
					prod = prod.multiply(c[j]);
			if (prod.compareTo(k) <= 0)
				subset2.add(prod);

		}
		Collections.sort(subset1);
		Collections.sort(subset2);
		int ans = 0;
		up = subset1.size();
		for (int i = 0; i < up; i++)
			ans += binarySearch(subset2, k.divide(subset1.get(i))) + 1;

		System.out.println(ans - 1);

	}

	public static int binarySearch(ArrayList<BigInteger> a, BigInteger key) {
		int l = 0, r = a.size() - 1, m;
		while (l <= r) {
			m = l + (r - l) / 2;

			if (a.get(m).compareTo(key) == 0) {
				r = m;
				break;
			}

			if (a.get(m).compareTo(key) < 0)
				l = m + 1;

			else
				r = m - 1;
		}
		return r;

	}

}
