package com.siddharth;

import java.util.ArrayList;
import java.util.Scanner;

public class DreemoonWifi {
	public static void main(String[] args) {
		int fact[] = new int[11];
		fact[0] = 1;

		for (int i = 1; i <= 10; i++)
			fact[i] = i * fact[i - 1];
		Scanner s = new Scanner(System.in);
		String str1 = s.next(), str2 = s.next();
		int count1 = 0, count2 = 0;
		ArrayList<Integer> a = new ArrayList<>();
		int i, n = str1.length();
		for (i = 0; i < n; i++) {
			if (str1.charAt(i) == '+')
				count1++;
			else
				count1--;
		}
		n = str2.length();
		int qcount = 0;
		for (i = 0; i < n; i++) {
			if (str2.charAt(i) == '+')
				count2++;
			else if (str2.charAt(i) == '-')
				count2--;
			else
				qcount++;

		}
		if (qcount == 0) {
			if (count2 != count1)
				System.out.println(0.0);
			else
				System.out.println(1.0);

		} else {
			double probability = 0;
			int x = qcount, no, temp = -qcount;
			for (i = 0; i <= x; i++) {
				no = fact[qcount] / (fact[qcount - i] * fact[i]);
				while (no-- > 0) {
					a.add(count2 + temp);

				}
				temp += 2;// += 2;
			}

			for (i = 0; i < a.size(); i++) {
				if (a.get(i) == count1)
					probability++;
			}

			double ans = probability / a.size();
			System.out.println(ans);

		}

	}

}