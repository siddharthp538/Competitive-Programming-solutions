package SiddharthMay17;

import java.util.Scanner;

class AIBOHP {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			String str = s.next();
			int i = 0;
			char[] a = str.toCharArray();
			int ans1 = 0, ans2 = 0, n = str.length(), j = n - 1;
			while (i < j) {
				if (a[i] == a[j]) {
					i++;
					j--;
				} else {
					ans1++;
					i++;
				}

			}
			i = 0;
			j = n - 1;
			while (i < j) {

				if (a[i] == a[j]) {
					j--;
					i++;
				} else {
					ans2++;
					j--;
				}

			}
			System.out.println(Math.min(ans1, ans2));

		}

	}

}
