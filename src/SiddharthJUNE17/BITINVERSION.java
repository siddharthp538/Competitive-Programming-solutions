package SiddharthJUNE17;

//Count number of inversions using Binary Indexed Tree

import java.io.*;
import java.util.*;

class BITINVERSION {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PrintWriter w = new PrintWriter(System.out);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			int max = -1;
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				max = Math.max(max, a[i]);
			}
			int[] BIT = new int[max + 1];
			long inv = 0;
			for (int i = n - 1; i >= 0; i--) {
				inv += getSum(BIT, a[i] - 1);
				updateBIT(BIT, a[i]);
			}
			w.println(inv);

		}
		w.close();
	}

	static long getSum(int[] BIT, int index) {
		long sum = 0;
		while (index > 0) {
			sum += BIT[index];
			index -= index & (-index);
		}
		return sum;
	}

	static void updateBIT(int[] BIT, int index) {
		while (index <= BIT.length - 1) {
			BIT[index]++;
			index += index & (-index);
		}
		return;

	}
}
