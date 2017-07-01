package com.siddharth;

import java.util.ArrayList;
import java.util.Scanner;

public class SantaDp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		int n = s.nextInt();
		int i = 1;
		n -= i;
		while (true) {
			if (i > n || i == n) {
				a.add(i + n);
				break;
			} else {
				a.add(i);
				i++;
				n -= i;
			}
		}
		System.out.println(a.size());
		for (int j = 0; j < a.size(); j++)
			System.out.print(a.get(j) + " ");

	}

}
