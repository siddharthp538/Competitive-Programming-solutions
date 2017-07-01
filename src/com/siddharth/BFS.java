package com.siddharth;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt(), m = s.nextInt();
			LinkedList<Integer> adj[] = new LinkedList[n + 1];
			for (int i = 0; i < n; i++) {
				adj[i] = new LinkedList<>();
			}

			for (int i = 0; i < m; i++) {
				int x = s.nextInt(), y = s.nextInt();
				if (x > y) {
					adj[y].add(x);
				} else
					adj[x].add(y);
			}

			Queue<Integer> q1 = new LinkedList<>();
			Queue<Integer> q2 = new LinkedList<>();
			q1.add(1);
			boolean[] visited = new boolean[n + 1];
			Arrays.fill(visited, false);
			int pop1 = 0, pop2 = 0, count = 0;
			boolean done1 = false, done2 = false;
			while (!q1.isEmpty() || !q2.isEmpty()) {

				while (!q1.isEmpty()) {
					pop1 = q1.poll();
					visited[pop1] = true;
					for (int i = 0; i < adj[pop1].size(); i++) {
						if (adj[pop1].get(i) != n && !visited[adj[pop1].get(i)]) {
							visited[adj[pop1].get(i)] = true;
							q2.add(adj[pop1].get(i));

						} else if (adj[pop1].get(i) == n) {
							count++;
							q1.clear();
							q2.clear();
							done1 = true;
							done2 = true;
							break;

						}

					}

				}
				if (!done1)
					count++;
				else
					break;

				while (!q2.isEmpty()) {
					pop2 = q2.poll();
					visited[pop2] = true;
					for (int i = 0; i < adj[pop2].size(); i++) {
						if (adj[pop2].get(i) != n && !visited[adj[pop2].get(i)]) {
							visited[adj[pop2].get(i)] = true;
							q1.add(adj[pop2].get(i));

						} else if (adj[pop2].get(i) == n) {
							count++;
							done2 = true;
							done1 = true;
							q1.clear();
							q2.clear();
							break;

						}

					}

				}
				if (!done2)
					count++;
				else
					break;

			}
			System.out.println(count);
		}
	}
}
