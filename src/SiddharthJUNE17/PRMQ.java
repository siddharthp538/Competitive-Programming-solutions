package SiddharthJUNE17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class PRMQ {
	static ArrayList<Long> prime;
	static long[] spf;
	static HashMap<Integer, Integer> map;
	static ArrayList<Long> pf[];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		seive();
		HashMap<Long, Long> factormap[] = new HashMap[1000001];
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			factormap[a[i]] = new HashMap<>();
			int x = a[i];
			for (int j = 0; j < pf[a[i]].size() && x > 1; j++) {
				long temp = 0;
				while (x % pf[a[i]].get(j) == 0) {
					temp++;
					x /= pf[a[i]].get(j);
					if (x <= 1)
						break;
				}
				factormap[a[i]].put(pf[a[i]].get(j), temp);
			}
		}
		int q = s.nextInt();

		while (q-- > 0) {
			int l = s.nextInt(), r = s.nextInt(), x = s.nextInt(), y = s.nextInt();
			long result = 0;
			for (long i = x; i <= y; i++) {
				for (long j = l - 1; j <= r - 1; j++)
					if (factormap[a[(int) j]].containsKey(i))
						result += factormap[a[(int) j]].get(i);

			}
			System.out.println(result);
		}

	}

	public static void seive() {
		prime = new ArrayList<>();
		pf = new ArrayList[1000001];
		for (int i = 0; i <= 1000000; i++)
			pf[i] = new ArrayList<>();
		spf = new long[1000001];
		for (long i = 2; i < 1000001; i++) {
			if (spf[(int) i] == 0) {
				spf[(int) i] = i;
				if (i < 1000)
					prime.add(i);
				for (long j = i; j <= 1000000; j += i) {
					pf[(int) j].add(i);
				}
			}
			for (int j = 0; j < prime.size() && prime.get(j) <= spf[(int) i] && i * prime.get(j) <= 1000000; j++) {
				spf[(int) (prime.get(j) * i)] = prime.get(j);
			}
		}

	}

	public static boolean isPrime(int x) {
		if (x % 2 == 0)
			return x == 2;
		for (int i = 3; i <= Math.sqrt(x); i += 2)
			if (x % i == 0)
				return false;
		return true;
	}

}
