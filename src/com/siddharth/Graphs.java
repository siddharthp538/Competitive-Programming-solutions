package com.siddharth;

import java.util.Arrays;
//undirected graph
//directed graph
//breadth first search
//adjacency lists
//adjacency matrix
//using breadth first search to find shortest path when weights of all nodes are same
//using breadth first search to find shortest path between node 1 and node n    WA :(   
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graphs {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedList<Integer> adj[] = new LinkedList[6];
		for (int i = 0; i < 6; i++) {
			adj[i] = new LinkedList<>();
		}
		// BFS(adj);
		// ShortestPathWhenSameWeight(adj, s);
		ShortestPathUsingBfs(s);
	}

	public static void ShortestPathUsingBfs(Scanner s) {
		int t = s.nextInt();
		while (t-- > 0) {

			int n = s.nextInt(), m = s.nextInt();
			LinkedList<Integer> adj[] = new LinkedList[n + 1];
			for (int i = 0; i < n + 1; i++) {
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

	public static void BFS(LinkedList<Integer> adj[]) {
		for (int i = 0; i < 6; i++) {
			adj[i] = new LinkedList<>();
		}
		adj[0].add(1);
		adj[0].add(2);
		adj[1].add(0);
		adj[1].add(3);
		adj[2].add(0);
		adj[2].add(3);
		adj[2].add(4);
		adj[3].add(1);
		adj[3].add(2);
		adj[3].add(5);
		adj[4].add(2);
		adj[5].add(3);
		boolean[] visited = new boolean[6];
		Arrays.fill(visited, false);
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		int pop = 0;
		while (!q.isEmpty()) {
			pop = q.poll();
			visited[pop] = true;
			{
				System.out.println(pop);
			}

			for (int i = 0; i < adj[pop].size(); i++) {
				if (visited[adj[pop].get(i)] == false) {
					q.add(adj[pop].get(i));
					visited[adj[pop].get(i)] = true;
				}

			}
		}
	}

	public static void ShortestPathWhenSameWeight(LinkedList<Integer> adj[], Scanner s) {
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < 5; i++) {
			adj[i] = new LinkedList<>();
		}
		int[] path = new int[4];
		boolean[] visited = new boolean[5];
		Arrays.fill(visited, false);
		adj[0].add(1);
		adj[0].add(2);
		adj[1].add(0);
		adj[1].add(3);
		adj[1].add(2);
		adj[3].add(1);
		adj[3].add(2);
		adj[2].add(0);
		adj[2].add(1);
		adj[2].add(3);
		q.add(0);// source node
		while (!q.isEmpty()) {
			int pop = q.poll();
			visited[pop] = true;
			for (int i = 0; i < adj[pop].size(); i++) {
				{

					if (!visited[adj[pop].get(i)]) {
						path[adj[pop].get(i)] = path[pop] + 1;
						q.add(adj[pop].get(i));
						visited[adj[pop].get(i)] = true;
					}
				}

			}
		}
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Shortet Path is : " + Math.abs(path[a] - path[b]));

	}
}
