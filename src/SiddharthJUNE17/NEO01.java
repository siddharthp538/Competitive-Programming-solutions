package SiddharthJUNE17;

import java.util.Arrays;
import java.util.Scanner;

class NEO01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int index = -1;
			int n = s.nextInt();
			int[] a = new int[n];
			long sum = 0, count = 0, negsum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				if (a[i] >= 0) {
					count++;
					sum += a[i];
				} else {
					negsum += a[i];
					index++;
				}
			}
			long ans = sum, sub = 0;
			sum = (sum * count) + negsum;
			Arrays.sort(a);
			long max = sum;
			for (int i = index; i >= 0; i--) {
				sub += a[i];
				count++;
				max = Math.max(max, ((ans + sub) * count) + (negsum - sub));
			}
			System.out.println(max);

		}
	}

}
