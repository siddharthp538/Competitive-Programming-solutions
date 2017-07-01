package com.siddharth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class WinOrFreeze {
	public static void main(String[] args) {
		calfact();
	}

	public static void calfact() {
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> pr = new ArrayList<>();
		ArrayList<Integer> store = new ArrayList<>();
		seive(pr);
		int t = s.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		while (t-- > 0) {
			map.clear();
			store.clear();
			int k = 0;
			int n = s.nextInt();

			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				factors(map, a[i], pr, store);

			}
			int ans = 1;
			for (int i = 0; i < store.size(); i++) {
				ans *= (map.get(store.get(i)) + 1);
			}
			System.out.println(ans);
		}
	}

	public static void seive(ArrayList<Integer> pr) {
		boolean[] prime = new boolean[1000001];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for (long i = 2; i < 1000001; i++) {
			if (prime[(int) i]) {
				pr.add((int) i);
				for (long j = i * i; j < 1000001; j += i) {
					prime[(int) j] = false;
				}
			}
		}
	}

	public static void factors(HashMap<Integer, Integer> map, int x, ArrayList<Integer> pr, ArrayList<Integer> store) {
		int temp = 0, k = 0;

		while (x > 1) {
			if (x % pr.get(k) == 0) {
				while (x % pr.get(k) == 0) {
					x /= pr.get(k);
					temp++;
					if (x == 1)
						break;
				}

				if (!map.containsKey(pr.get(k))) {
					map.put(pr.get(k), temp);
					store.add(pr.get(k));
				} else if (map.containsKey(pr.get(k)))
					map.put(pr.get(k), map.get(pr.get(k)) + temp);
				temp = 0;

			}
			k++;
		}

	}

}
