package SiddharthMay17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SUBINVER {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), q = s.nextInt();
		char[] a = new char[n];

		for (int i = 0; i < n; i++) {
			a[i] = '0';
		}
		ArrayList<String> ans = new ArrayList<>();
		while (q-- > 0) {
			int l = s.nextInt() - 1, r = s.nextInt() - 1;
			for (int i = l; i <= r; i++) {
				if (a[i] == '1')
					a[i] = '0';
				else
					a[i] = '1';

			}
			String temp = new String(a);
			ans.add(temp);
		}
		Collections.sort(ans);
		System.out.println(ans.get(n - 1));
	}

}
