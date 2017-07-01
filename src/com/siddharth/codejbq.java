package com.siddharth;

import java.util.Scanner;

public class codejbq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int t = 0; t < test; t++) {

			long no = sc.nextLong();
			String tx = Long.toString(no);
			if (givemethetidy(no)) {

				System.out.println("Case #" + (t + 1) + ": " + (no));

			} else if (check(tx)) {
				int len = tx.length();
				StringBuilder sb = new StringBuilder();
				for (int i = 1; i < len; i++) {
					sb.append("9");

				}
				System.out.println("Case #" + (t + 1) + ": " + (sb.toString()));

			} else {

				String str = Long.toString(no);
				StringBuilder ans = new StringBuilder("1");
				int len = 1;
				long no1 = no;
				while (true) {
					ans.append("0");

					long temp = Long.parseLong(ans.toString());
					long ans1 = no1 - (no1 % temp) - 1;

					if (givemethetidy(ans1)) {
						System.out.println("Case #" + (t + 1) + ": " + (ans1));
						break;
					}
				}
			}
		}
	}

	static boolean givemethetidy(long no) {
		long answer = no % 10;
		no = no / 10;
		boolean flag = true;
		while (no != 0) {
			if (answer < no % 10) {
				flag = false;
				break;
			}
			answer = no % 10;
			no = no / 10;
		}
		if (flag)
			return true;
		return false;
	}

	static boolean check(String str) {
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) != '1' && str.charAt(i) != '0')
				return false;
		}
		return true;
	}

}
