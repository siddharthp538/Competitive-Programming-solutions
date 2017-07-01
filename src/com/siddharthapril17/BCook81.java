package com.siddharthapril17;
//upsolve-cook81
import java.util.Scanner;

class BCook81 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			run(s);

		}

	}

	public static void run(Scanner s) {
		
		long n = s.nextLong(), k = s.nextLong(), acnt = 0, bcnt = 0;
		long ans = 0;
		String str = s.next();
		char[] a = str.toCharArray();
		for (int i = 0; i < n; i++) {
			if (a[i] == 'a')
				acnt++;
			else if (a[i] == 'b') {
				bcnt++;
				ans += acnt;
			}

		}
		ans *= k;
		ans += acnt * bcnt * k * (k - 1) / 2;
		System.out.println(ans);
	}
}
