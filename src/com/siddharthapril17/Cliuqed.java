package com.siddharthapril17;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Cliuqed {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			PriorityQueue<distv> pq = new PriorityQueue<>(new dc());

			int n = s.nextInt(), k = s.nextInt(), x = s.nextInt(), m = s.nextInt(), s1 = s.nextInt();

			LinkedList<make_pair> adj[] = new LinkedList[n + 2];

			int[] a = new int[n + 2];
			a[0] = Integer.MAX_VALUE;
			for (int i = 0; i < n + 1; i++) {
				adj[i + 1] = new LinkedList<>();

				a[i + 1] = Integer.MAX_VALUE;
			}
			int z = n + 1;

			for (int i = 1; i <= k; i++) {

				adj[i].add(new make_pair(z, x));
				adj[z].add(new make_pair(i, 0));

			}

			while (m-- > 0) {
				int node1 = s.nextInt(), node2 = s.nextInt(), w = s.nextInt();
				adj[node1].add(new make_pair(node2, w));
				adj[node2].add(new make_pair(node1, w));

			}

			dijkstra(pq, s1, adj, a);

			print_ans(n, a);
		}
	}

	public static void print_ans(int n, int[] a) {
		for (int i = 1; i <= n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void dijkstra(PriorityQueue<distv> pq, int s1, LinkedList<make_pair>[] adj, int[] a) {
		a[s1] = 0;
		pq.add(new distv(0, s1));

		while (!pq.isEmpty()) {
			int u = pq.poll().vertex;
			for (int i = 0; i < adj[u].size(); i++) {
				int v = adj[u].get(i).data;
				int w = adj[u].get(i).weight;
				if (a[v] > a[u] + w) {
					a[v] = a[u] + w;
					pq.add(new distv(a[v], v));
				}
			}

		}
	}

}

class make_pair {
	int data, weight;

	make_pair(int data, int weight) {
		this.data = data;
		this.weight = weight;
	}

}

class distv {
	int vertex, distance;

	public distv(int distance, int vertex) {

		this.vertex = vertex;
		this.distance = distance;
	}

}

class dc implements Comparator<distv> {

	public int compare(distv o1, distv o2) {

		return o1.distance - o2.distance;

	}

}