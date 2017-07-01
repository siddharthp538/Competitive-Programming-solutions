package com.graph.pojo;

import java.util.HashSet;
import java.util.Scanner;

public class Tourner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		HashSet<Integer>[] a = new HashSet[n];

		for (int i = 0; i < n; i++) {

			a[i] = new HashSet<Integer>();
			int k = scanner.nextInt();

			for (int j = 0; j < k; j++) {

				a[i].add(scanner.nextInt());

			}
		}
		int count = n;
		for (int i = 0; i < n; i++) {

			HashSet<Integer> hashSet = a[i];
			HashSet<Integer> visitted = new HashSet<>();
			if (hashSet.size() > 0) {
				for (Integer integer : hashSet) {

					if (visitted.contains(integer - 1)) {
						if (a[integer - 1].size() > 0) {

							visitted.add(integer - 1);

						} else {
							count--;
							break;
						}
					}
				}

			} else {
				count--;
				break;
			}
			for (int j = i + 1; j < n; j++) {

				if (a[j].size() == 0) {
					count--;
					break;
				}
			}

		}

		System.out.println(count);

	}

}
