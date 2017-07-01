package com.siddharthapril17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class CLtime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int q = s.nextInt(), n = q;
		boolean[] mark = new boolean[n];
		Arrays.fill(mark, true);
		set[] a = new set[n];
		HashMap<set, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++)
			a[i] = new set();
		for (int i = 0; i < q; i++) {
			char c = s.next().charAt(0);
			int first = s.nextInt(), second = s.nextInt();
			map.put(new set(first, second), i);
			a[i].first = first;
			a[i].second = second;
			if (c == '+') {
				System.out.println(cal(mark, a, i + 1));
			} else {
				mark[i] = false;
				if (map.containsKey(new set(first, second))
						
						
						
						) {
					mark[map.get(new set(first, second))] = false;
				}

				System.out.println(cal(mark, a, i + 1));

			}

		}

	}

	public static long cal(boolean[] mark, set[] a, int k) {
		if (k == 1)
			return 0;
		long ans = Integer.MAX_VALUE;
		for (int i = 0; i < k; i++) {
			for (int j = i + 1; j < k; j++) {
				if (mark[i] && mark[j]) {
					ans = Math.min(((a[i].first - a[j].first) * (a[i].first - a[j].first))
							+ ((a[i].second - a[j].second) * (a[i].second - a[j].second)), ans);

				}
			}

		}

		return ans;
	}

}

class set {
	int first, second;

	set(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public set() {

	}
}
