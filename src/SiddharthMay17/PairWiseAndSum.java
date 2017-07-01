package SiddharthMay17;

import java.util.Scanner;

class PairWiseAndSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int ans = 0;
		for (int i = 0; i < 32; i++) {
			int k = 0;
			int temp = 1 << i;
			for (int j = 0; j < n; j++)
				if ((a[j] & (temp)) != 0)
					k++;

			ans += (temp) * (k * (k - 1) / 2);

		}
		System.out.println(ans);
	}

}
