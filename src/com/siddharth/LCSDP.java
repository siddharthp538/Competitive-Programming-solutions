package com.siddharth;

//non-dp solution using bf+maps
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class LCSDP {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		HashMap<Integer, ArrayList<Integer>> m1 = new HashMap<>();
		HashMap<Integer, ArrayList<Integer>> m2 = new HashMap<>();
		int[] a = new int[n];
		int[] b = new int[m];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			if (m2.containsKey(a[i])) {
				m2.get(a[i]).add(i);
			} else {
				ArrayList<Integer> p = new ArrayList<>();
				p.add(i);
				m2.put(a[i], p);
			}
		}
		for (int i = 0; i < m; i++) {
			b[i] = s.nextInt();

			if (m1.containsKey(b[i])) {
				m1.get(b[i]).add(i);
			} else {
				ArrayList<Integer> p = new ArrayList<>();
				p.add(i);
				m1.put(b[i], p);
			}
		}
		ArrayList<Integer> f_ans = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		int ans = 0, maxseq = 0;
		for (int i = 0; i < n; i++) {
			int max = Integer.MIN_VALUE;
			temp.clear();
			for (int j = i; j < n; j++) {

				if (i < a.length && j < a.length && m1.containsKey(a[j])) {
					for (int k = 0; k < m1.get(a[j]).size(); k++) {
						if (m1.get(a[j]).get(k) > max) {
							max = m1.get(a[j]).get(k);
							ans += 1;
							temp.add(a[j]);
							break;

						}
					}
				}
			}
			if (ans > maxseq) {
				f_ans.clear();
				for (int q = 0; q < temp.size(); q++) {
					f_ans.add(temp.get(q));
				}
			}
			maxseq = Math.max(maxseq, ans);
			ans = 0;
		}
		ans = 0;
		temp.clear();
		for (int i = 0; i < n; i++) {
			int max = Integer.MIN_VALUE;
			temp.clear();
			for (int j = i; j < n; j++) {

				if (i < b.length && j < b.length && m2.containsKey(b[j])) {

					for (int k = 0; k < m2.get(b[j]).size(); k++) {
						if (m2.get(b[j]).get(k) > max) {
							max = m2.get(b[j]).get(k);
							ans += 1;
							temp.add(b[j]);
							break;
						}
					}
				}
			}
			if (ans > maxseq) {
				f_ans.clear();
				for (int q = 0; q < temp.size(); q++) {
					f_ans.add(temp.get(q));
				}

			}
			maxseq = Math.max(maxseq, ans);
			ans = 0;
		}
		for (int i = 0; i < f_ans.size(); i++)
			System.out.print(f_ans.get(i) + " ");
	}
}
