package com.siddharth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TanyaAndToys {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] a = new int[n];
		ArrayList<Integer> toys = new ArrayList<>();
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		Arrays.sort(a);
		int toy = 1, sum = 0, i = 0;
		while (true) {
			if (toy != a[i] && m >= (sum + toy)) {
				toys.add(toy);
				sum += toy;
				toy++;
			} else if (m < (sum + toy)) {
				break;
			} else {
				if (i != n - 1)
					i++;
				toy++;
			}

		}
		System.out.println(toys.size());
		for (i = 0; i < toys.size(); i++) {
			System.out.print(toys.get(i) + " ");
		}
		s.close();

	}

}
