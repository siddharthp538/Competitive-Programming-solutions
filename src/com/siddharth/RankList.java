package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

public class RankList {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		TakeArrayInput(a, s);
        sort(a);
		PrintTheArray(a);
	}

	public static void sort(int[] a) {
		Arrays.sort(a);
	}

	public static void PrintTheArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void TakeArrayInput(int[] a, Scanner s) {

		for (int i = 0; i < a.length; i++)
			a[i] = s.nextInt();
	}
}
