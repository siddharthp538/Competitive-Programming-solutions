package com.siddharth;

import java.util.Scanner;

class RESCALC {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		while (t-- > 0) {
			int m = s.nextInt();
			int fin[] = new int[m];
			int j = 0;
			while (m-- > 0) {
				int k = s.nextInt();
				int ansfin = k;

				int[] ans = new int[7];
				int temp[] = new int[k];
				for (int i = 0; i < k; i++) {
					temp[i] = s.nextInt();
					ans[temp[i]]++;
				}

				int count = 0;

				count = count(ans);
				while (count >= 4) {
					if (count == 4)
						ansfin += 1;
					else if (count == 5)
						ansfin += 2;
					else
						ansfin += 4;
					count = count(ans);
				}
				fin[j] = ansfin;
				j++;

			}
			int max = Integer.MIN_VALUE, index = 0, tc = 0;
			for (int i = 0; i < fin.length; i++) {
				if (fin[i] > max) {
					tc = 1;
					index = i;
					max = fin[i];
				} else if (fin[i] == max)
					tc++;

			}
			if (tc > 1) {
				System.out.println("tie");
			} else if (index == 0) {
				System.out.println("chef");
			} else {
				System.out.println(index + 1);
			}

		}

	}

	public static int count(int[] temp) {
		int count = 0;
		for (int i = 1; i < 7; i++) {
			if (temp[i] > 0) {
				count++;
				--temp[i];
			}
		}
		return count;
	}

}
