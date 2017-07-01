package com.siddharth;

import java.util.Scanner;

public class codejb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		for (int t = 0; t < test; t++) {
			String s = sc.next();
			int k = sc.nextInt();
			char[] temp = s.toCharArray();
			int ans = 0;
			boolean flag = true;
			while (shouldcont(temp) == false) {
				ans++;
				if (ans > temp.length) {
					flag = false;
					break;
				}
				for (int i = 0; i < temp.length; i++) {
					if (temp[i] != '+') {
						int curr = 0, tempindex = i;
						if (temp.length > i + k - 1) {
							while (curr < k) {
								if (temp[tempindex] == '-')
									temp[tempindex] = '+';
								else
									temp[tempindex] = '-';
								curr++;
								tempindex++;
							}
						}
						break;

					}
				}

			}
			if (flag)
				System.out.println("Case #" + (t + 1) + ": " + ans);
			else {
				System.out.println("Case #" + (t + 1) + ": " + "IMPOSSIBLE");
			}

		}
		sc.close();
	}

	static boolean shouldcont(char[] temp) {
		boolean done = false;
		for (int k = 0; k < temp.length; k++) {
			if (temp[k] == '-') {
				done = true;
				break;
			}
		}
		if (done)
			return false;
		else
			return true;
	}

}
