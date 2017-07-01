package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

public class SegmentTree {
	static int MAX_VALUE = 1000000;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] input = new int[s.nextInt()];
		for (int i = 0; i < input.length; ++i)
			input[i] = s.nextInt();
		int seglength = 0;

		seglength = (CheckPowerOf2(input.length) * 2) - 1;
		int[] SegTree = new int[seglength];
		Arrays.fill(SegTree, MAX_VALUE);
		ConstructSegTree(input, SegTree, 0, 3, 0);
		for (int i = 0; i < seglength; i++)
			System.out.println(SegTree[i]);

	}

	public static void ConstructSegTree(int[] input, int[] SegTree, int low, int high, int pos) {
		if (low == high) {
			SegTree[pos] = input[low];
			return;

		}
		int mid = (low + high) / 2;
		ConstructSegTree(input, SegTree, low, mid, (2 * pos + 1));
		ConstructSegTree(input, SegTree, mid + 1, high, (2 * pos + 2));
		SegTree[pos] = Math.min(SegTree[(2 * pos + 1)], SegTree[(2 * pos + 2)]);
	}

	public static int MinRangeQuery(int SegTree[], int qlow, int qhigh, int low, int high, int pos) {
		if (qlow <= low && qhigh >= high) {
			return SegTree[pos];
		}
		if (qlow > high || qhigh < low) {
			return MAX_VALUE;
		}
		int mid = (low + high) / 2;
		return Math.min(MinRangeQuery(SegTree, qlow, qhigh, low, mid, (2 * pos + 1)),
				MinRangeQuery(SegTree, qlow, qhigh, mid + 1, high, (2 * pos + 2)));

	}

	public static int CheckPowerOf2(int n) {
		int x = 0;
		if ((Math.log10(n) / Math.log10(2) == (int) (Math.log10(n) / Math.log10(2)))) {
			x = ((int) (Math.log10(n) / Math.log10(2)));
		} else {
			x = 1 + ((int) (Math.log10(n) / Math.log10(2)));
		}
		return x;

	}
	
}
