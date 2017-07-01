package com.siddharth;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadBoard {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++)
			a[i] = s.nextInt();
		int scores = s.nextInt();
		int[] b = new int[scores];
		for (int i = 0; i < scores; i++) {
			b[i] = s.nextInt();
		}
		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < a.length - 2; i++) {
			if (a[i] != a[i + 1])
				temp.add(a[i]);
		}
		if (a[a.length - 1] != a[a.length - 2]) {
			temp.add(a[a.length - 2]);
			temp.add(a[a.length - 1]);

		} else if (a[a.length - 1] == a[a.length - 2]) {
			temp.add(a[a.length - 1]);
		}
		// System.out.println(temp);
		int k = 0;
		for (int i = temp.size() - 1; i >= 0; i--) {
			if (b[k] < temp.get(i)) {
				System.out.println(i + 2);
				if (k < scores - 1)
					k++;
			} else if (b[k] >= temp.get(i)) {
				if (scores - 1 > k)
					k++;
				System.out.println(i + 1);
			}
		}

	}

}
