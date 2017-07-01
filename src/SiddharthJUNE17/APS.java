package SiddharthJUNE17;

import java.io.PrintWriter;
import java.util.Scanner;

class APS {
	static long[] pre;
	static long[] res;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PrintWriter w = new PrintWriter(System.out);
		seive();

		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			w.println(res[n]);
		}
		w.close();

	}

	static void seive() {
		pre = new long[10000005];
		res = new long[10000005];
		res[0] = res[1] = 0;
		for (long i = 2; i < 10000001; i++) {
			if (pre[(int) i] == 0) {
				pre[(int) i] = (int) i;
				for (long j = i * i; j < 10000001; j += i) {
					if (pre[(int) j] == 0)
						pre[(int) j] = (int) i;
				}
				res[(int) i] = res[(int) (i - 1)] + (int) i;
			} else
				res[(int) i] = res[(int) (i - 1)] + pre[(int) i];
		}
	}

}
