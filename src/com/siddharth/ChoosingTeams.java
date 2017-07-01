package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

public class ChoosingTeams {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int noofiterations = n / 3, min = 5 - k, count = 0, i = 0;
		Arrays.sort(a);
		while (noofiterations-- > 0) {
			if (a[i] <= min && a[i + 1] <= min && a[i + 2] <= min)
				count++;
			i += 3;
		}
		System.out.println(count);

	}

}
