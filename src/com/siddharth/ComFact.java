package com.siddharth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ComFact {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong(), b = s.nextLong();
		long sqa = (long) Math.sqrt(a);
		long sqb = (long) Math.sqrt(b);
		HashMap<Long, Long> m1 = new HashMap<>();
		ArrayList<Long> al = new ArrayList<>();
		for (long i = 1; i <= sqa + 1; i++) {
			
			if (a % i == 0) {
				if (a / i == i) {
					m1.put(i, i);
				} else {
					m1.put(a / i, a / i);
					m1.put(i, i);
				}

			}
		}
		long count = 0;
		for (long i = 1; i <= sqb + 1; i++) {
			if (b % i == 0) {
				if (b / i == i)
					al.add(i);
				else {
					al.add(i);
					al.add(b / i);
				}
			}
		}
		for (int i = 0; i < al.size(); i++) {
			if (m1.containsKey(al.get(i)))
				count++;
		}
		System.out.println(count);

	}

}
