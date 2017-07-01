package SiddharthMay17;

import java.util.Scanner;

class SNTEMPLE {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			long sum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				sum += a[i];
			}
			long min = Integer.MAX_VALUE;
			int k = 0, curr = 0;
			for (int i = 3; i <= n; i += 2) {
				long temp = 0, temp2 = 0;
				boolean ok = false;
				k = 0;
				for (int c = 0; c <= n - i; c++) {
					curr = 0;
					temp2 = 0;
					temp = 0;
					k = 0;
					for (int j = c; j < i + c; j++) {
						temp += a[j];
						if (k > i / 2)
							curr--;
						else
							curr++;
						k++;
						temp2 += Math.abs(curr - a[j]);

					}
					min = Math.min(min, sum - temp + temp2);

				}

			}
			System.out.println(min);

		}
	}

}
