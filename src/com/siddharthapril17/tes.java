package com.siddharthapril17;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class tes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		Vector<Integer> v = new Vector<>();
		int count = 0;
		for (int i = 1; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				if (x / i == i) {
					v.add(i);
				} else {
					v.add(i);
					v.add(x / i);
				}
			}
		}
		Collections.sort(v);
		for (int i = 0; i < v.size() - 1; i++) {
			System.out.print(v.get(i) + " ");
		}

	}

}
