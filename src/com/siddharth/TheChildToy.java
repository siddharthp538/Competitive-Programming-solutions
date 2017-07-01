package com.siddharth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TheChildToy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		LinkedList<Integer> adj[] = new LinkedList[n + 1];
		initialise(n, adj);
		int[] sorted = new int[n + 1];
		int[] unsorted = new int[n + 1];
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			sorted[i] = s.nextInt();
			unsorted[i] = sorted[i];
			if (map.containsKey(unsorted[i])) {
				map.get(unsorted[i]).add(i);
			} else {
				ArrayList<Integer> arrayList = new ArrayList<>();
				arrayList.add(i);
				map.put(unsorted[i], arrayList);
			}

		}
		Arrays.sort(sorted);

		while (m-- > 0) {
			int node1 = s.nextInt();
			int node2 = s.nextInt();
			adj[node2].add(node1);
			adj[node1].add(node2);
		}
		int sum = 0;
		for (int i = sorted.length - 1; i >= 1; i--) {
			List<Integer> k = map.get(sorted[i]);
			int l = k.remove(k.size() - 1);

			for (int j = 0; j < adj[l].size(); j++) {
				sum += unsorted[adj[l].get(j)];
			}
			unsorted[l] = 0;

		}
		System.out.println(sum);

	}

	public static void initialise(int n, LinkedList<Integer>[] adj) {
		for (int i = 1; i < n + 1; i++) {
			adj[i] = new LinkedList<>();
		}
	}
}
