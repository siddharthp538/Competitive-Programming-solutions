package com.siddharth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BathroomStalls {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt(), caseno = 0;
		while (t-- > 0) {
			PriorityQueue<Long> pq = new PriorityQueue<>(new compar());
			long x = s.nextLong();
			ArrayList<Integer> a = new ArrayList<>();
			long k = s.nextLong(), work = k - 1;
			pq.add(x);
			long max = 0;

			for (int i = 0; i < work; i++) {
				long temp = pq.poll();

				if (temp % 2 == 0) {
					pq.add(temp / 2);
					pq.add((temp / 2) - 1);
				} else {
					pq.add(temp / 2);
					pq.add(temp / 2);

				}

			}
			max = pq.poll();
			if (max % 2 == 0) {

				System.out.println("Case #" + (++caseno) + ": " + Math.max(max / 2, max / 2 - 1) + " "
						+ Math.min(max / 2, max / 2 - 1));

			} else {
				System.out.println("Case #" + (++caseno) + ": " + Math.max(max / 2, max / 2 - 1) + " "
						+ Math.min(max / 2, max / 2));

			}

		}

	}

	public static int max(ArrayList<Integer> a) {
		int max = Integer.MIN_VALUE;
		int len = a.size(), ans = -1, i;
		for (i = 0; i < len; i++) {
			if (a.get(i) > max) {
				max = a.get(i);
				ans = i;
			}
		}
		return ans;
	}
}

class compar implements Comparator<Long> {

	public int compare(Long o1, Long o2) {

		return o2.intValue() - o1.intValue();
	}

}
