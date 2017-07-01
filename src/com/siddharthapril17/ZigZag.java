package com.siddharthapril17;

import java.util.ArrayList;
import java.util.Scanner;

public class ZigZag {
	static ArrayList<Integer> a = new ArrayList<>();

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++)
			a.add(s.nextInt());
		if (n == 2)
			System.out.println(0);
		else {
			zigzagcount();
		}

	}

	public static void zigzagcount() {
		int count = 0;
		while (valid(a)) {
			count++;

		}
		System.out.println(count);

	}

	public static boolean valid(ArrayList<Integer> a) {
		int n = a.size();
		for (int i = 0; i < n - 2; i++) {
			if (a.get(i) > a.get(i + 1) && a.get(i + 1) > a.get(i + 2)) {
				a.remove(i + 1);

				return true;

			} else if ((a.get(i) < a.get(i + 1) && a.get(i + 1) < a.get(i + 2))) {
				a.remove(i + 1);
				return true;
			}

		}
		return false;

	}

}
