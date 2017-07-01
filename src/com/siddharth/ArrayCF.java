package com.siddharth;

import java.util.Scanner;

public class ArrayCF {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, max = 0, min = Integer.MAX_VALUE, ind = -1;
		int[] m = new int[1000005];
		int[] l = new int[1000005];
		n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int x = s.nextInt();
			if (m[x] == 0) {
				l[x] = i;
				m[x] = 1;
			} else
				m[x]++;
			if (m[x] > max) {
				max = m[x];
				min = i - l[x] + 1;
				ind = l[x] + 1;
			} else if (m[x] == max && i - l[x] + 1 < min) {
				min = i - l[x] + 1;
				ind = l[x] + 1;
			}
		
		}
		System.out.println(ind+" " +(ind+min-1));
		
	}

}