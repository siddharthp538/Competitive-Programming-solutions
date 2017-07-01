package SiddharthJUNE17;

//Count number of inversion using merge sort
import java.io.*;
import java.util.*;

class INVERSIONS {
	public static void main(String[] args) {
		invcount();
	}

	public static void invcount() {
		Scanner s = new Scanner(System.in);
		PrintWriter w = new PrintWriter(System.out);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = s.nextLong();
			long[] temp = new long[n];
			w.println(mergeSort(a, temp, 0, a.length - 1));

		}
		w.close();
	}

	static long mergeSort(long[] a, long[] temp, int l, int r) {
		long invcount = 0;
		if (l < r) {
			int mid = (l + r) / 2;
			invcount = mergeSort(a, temp, l, mid);
			invcount += mergeSort(a, temp, mid + 1, r);
			invcount += merge(a, temp, l, mid + 1, r);
		}
		return invcount;

	}

	static long merge(long[] a, long[] temp, int l, int m, int r) {
		int i = l, j = m, k = l;
		long invcount = 0;
		while ((i <= m - 1) && (j <= r)) {
			if (a[i] <= a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
				invcount += (m - i);
			}
		}
		while (i <= m - 1) {
			temp[k++] = a[i++];
		}
		while (j <= r) {
			temp[k++] = a[j++];
		}
		for (i = l; i <= r; i++)
			a[i] = temp[i];
		return invcount;

	}
}
