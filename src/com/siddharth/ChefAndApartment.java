package com.siddharth;

import java.util.Scanner;

class ChefAndApartment {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int a[] = new int[n];
			boolean ok = false;
			long ans = 0;
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			for (int i = 0; i < n; i++) {
				if (a[i] == 0 && !ok) {
					ok = true;
					ans+=1100;
				} else if(ok) {
					if (a[i] == 1) {
						ans += 100;
					} else
						ans += 1100;
				}
			}
			System.out.println(ans);
		}
	}

}
