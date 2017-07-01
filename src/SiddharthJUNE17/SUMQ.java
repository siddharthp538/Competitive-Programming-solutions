package SiddharthJUNE17;

//CodeChef's June Long 2017 Problem no 5.
//Binary search+precomputation
import java.util.Arrays;
import java.util.Scanner;

class SUMQ {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int mod = 1000000007;
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			int l = s.nextInt(), m = s.nextInt(), n = s.nextInt();
			long[] a = new long[l];
			long[] b = new long[m];
			long[] c = new long[n];
			long[] presuma = new long[l];
			long[] presumc = new long[n];
			for (int i = 0; i < l; i++)
				a[i] = s.nextLong();
			for (int i = 0; i < m; i++)
				b[i] = s.nextLong();
			for (int i = 0; i < n; i++)
				c[i] = s.nextLong();
			Arrays.sort(a);
			Arrays.sort(b);
			Arrays.sort(c);
			presuma[0] = a[0];
			presumc[0] = c[0];
			for (int i = 1; i < l; i++)
				presuma[i] = presuma[i - 1] + a[i];
			for (int i = 1; i < n; i++)
				presumc[i] = presumc[i - 1] + c[i];
			long sum = 0, temp = 0;
			int preva = 0, prevc = 0, numbera = 0, numberc = 0;
			for (int i = 0; i < m; i++) {
				temp = 0;
				numbera = search(a, b[i], preva) + 1;
				numberc = search(c, b[i], prevc) + 1;
				preva = numbera;
				prevc = numberc;
				if (numbera == 0 || numberc == 0)
					continue;
				temp += ((numbera * b[i]) % mod + presuma[numbera - 1] % mod) % mod
						* ((numberc * b[i]) % mod + presumc[numberc - 1] % mod) % mod;
				sum += temp % mod;
			}
			sb.append(sum % mod + "\n");

		}
		System.out.println(sb);

	}

	public static int search(long[] a, long key, int prev) {
		for (int i = prev; i < a.length; i++)
			if (a[i] > key)
				return --i;
		return (a.length - 1);
	}

}
