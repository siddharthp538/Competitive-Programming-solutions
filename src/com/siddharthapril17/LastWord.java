package com.siddharthapril17;

import java.util.ArrayList;
import java.util.Scanner;

public class LastWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int cn = 0;
		while (t-- > 0) {
			String str = s.next();
			char[] a = str.toCharArray();
			ArrayList<Character> ans = new ArrayList<>();
			ans.add(a[0]);
			for (int j = 1; j < a.length; j++) {
				if (a[j] >= ans.get(0)) {
					ans.add(0, a[j]);

				} else {
					ans.add(a[j]);
				}
			}
			System.out.print("Case #" + (++cn) + ": ");
			for (int j = 0; j < ans.size(); j++) {
				System.out.print(ans.get(j));
			}
			System.out.println();

		}
	}

}
