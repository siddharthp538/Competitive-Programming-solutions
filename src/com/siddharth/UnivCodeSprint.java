package com.siddharth;

import java.util.ArrayList;
import java.util.Scanner;

public class UnivCodeSprint {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long t = s.nextLong();
		while (t-- > 0) {
			long size1 = s.nextLong();
			long size2 = s.nextLong();
			long sum = 0, range = s.nextLong();
			ArrayList<Long> a1 = new ArrayList<>();
			ArrayList<Long> a2 = new ArrayList<>();
			for (int i = 0; i < size1; i++) {
				a1.add(s.nextLong());
			}
			for (int i = 0; i < size2; i++) {
				a2.add(s.nextLong());
			}
			long count = 0;

			while (range > sum) {
				if (a1.size() > 0 && a2.size() > 0) {
					if (a2.get(0) < a1.get(0)) {
						sum += a2.get(0);
						if (sum > range)
							break;
						count++;
						a2.remove(0);
					} else {
						sum += a1.get(0);
						if (range < sum)
							
							break;
						count++;
						a1.remove(0);
					}

				} else if (a1.size() == 0 && a2.size() > 0) {
					sum += a2.get(0);
					if (range < sum)
						break;
					count++;
					a2.remove(0);

				} else if (a2.size() == 0 && a1.size() > 0) {
					sum += a1.get(0);
					if (range < sum)
						break;
					count++;
					a1.remove(0);
				}
				if (a1.size() == 0 && a2.size() == 0)
					break;

			}
			System.out.println(count);
		}
	}

}
