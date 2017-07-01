package com.siddharthapril17;

import java.util.Scanner;

class Row {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			String str = s.next();
			long ans = 0, c = 1;
			int i;
			for (i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '1') {
					break;
				}
			}
			int k = 0;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(j) == '1') {
					if (k != 0) {
						ans += (k + 1) * c;
					}
					c++;
					k = 0;
				} else {
					k++;

				}

			}
			if (k != 0)
				ans += (k + 1) * c;
			System.out.println(ans);

		}

	}

}
