package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

public class AmrChemistry {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		double[] a = new double[n];
		double min = Double.MAX_VALUE;
		int[] check = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextDouble();

		}
		Arrays.sort(a);
		int[] power = new int[n];
		for (int i = 0; i < n; i++) {
			power[i] = (int) (Math.log(a[i]) / Math.log(2));
		}
		Arrays.sort(power);
		int sum = 0, ans = 0;
		for (int i = 0; i < power.length; i++) {
			sum += power[i];
		}

		if (CheckAllDiff(power)) {

			for (int i = 0; i < power.length; i++) {
				ans += power[i] - (sum / power.length);
			}
			System.out.println(ans);
		} else if (Check(power)) {

		} else {

		}

	}

	public static boolean CheckAllDiff(int[] a) {
		// Arrays.sort(a);
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean Check(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1])
				return false;
		}
		return true;
	}

}
