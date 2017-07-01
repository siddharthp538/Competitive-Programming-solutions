package SiddharthMay17;

import java.util.Scanner;

class SEAVOTE {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			calc(s);
		}
	}

	public static void calc(Scanner s) {
		int n = s.nextInt();
		int[] a = new int[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			sum += a[i];
		}
		if (sum < 100)
			System.out.println("NO");
		else {
			sum -= 100;
			sum++;
			System.out.println(sum <= n ? "YES" : "NO");
		}

	}

}
