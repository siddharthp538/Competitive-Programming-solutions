package SiddharthMay17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class SegmentedSieve {
	static int a, b;
	static ArrayList<Integer> prime;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			a = s.nextInt();
			b = s.nextInt();
			prime = new ArrayList<>();
			new SegmentedSieve().segmented_sieve();
			System.out.println();

		}

	}

	void segmented_sieve() {

		int limit = (int) Math.sqrt(b - a + 1);
		if ((double) Math.floor(Math.sqrt(b - a + 1)) != (double) Math.sqrt(b - a + 1))
			limit++;
		int low = a + limit, high = (2 * limit) - 1 + a;
		new SegmentedSieve().simplesieve(low - limit, high - limit);
		if (high > b)
			high = b;
		while (low <= b) {
			boolean[] mark = new boolean[limit + 1];
			Arrays.fill(mark, true);
			for (int i = 0; i < prime.size(); i++) {
				int loLim = (int) Math.floor(low / prime.get(i)) * prime.get(i);
				if (loLim < low)
					loLim += prime.get(i);
				for (int j = loLim; j <= high; j += prime.get(i)) {
					mark[j - low] = false;
				}
			}
			for (int i = low; i <= high; i++)
				if (mark[i - low])
					System.out.println(i);
			low += limit;
			high += limit;
			if (high > b)
				high = b;
		}

	}

	void simplesieve(int start, int end) {
		boolean[] mark = new boolean[end + 2];
		Arrays.fill(mark, true);
		mark[1] = false;
		for (int i = 2; i <= end; i++) {
			if (mark[i]) {
				if (i >= start) {
					prime.add(i);
					System.out.println(i);
				}
				for (int j = i * i; j <= end; j += i)
					mark[j] = false;
			}
		}

	}

}
