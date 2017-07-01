package com.siddharth;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class DFS {
	static boolean visited[] = new boolean[7];

	static LinkedList<Integer> adj[] = new LinkedList[7];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		initialise(adj);
		adj[1].add(2);
		adj[1].add(3);
		adj[2].add(4);
		adj[2].add(5);
		adj[3].add(5);
		adj[3].add(6);
		adj[4].add(2);
		adj[5].add(2);
		adj[5].add(3);
		adj[6].add(3);
		System.out.print("Depth First Traversal for the following graph is "
				+ "");
		dfs(1);

	}

	static void dfs(int n) {
		System.out.print(n + " ");
		visited[n] = true;
		for (int i = 0; i < adj[n].size(); i++) {
			if (!visited[adj[n].get(i)]) {
				dfs(adj[n].get(i));
			}
		}

	}

	static void initialise(LinkedList<Integer> a[]) {
		for (int i = 0; i < a.length; i++) {
			a[i] = new LinkedList<>();
		}
	}

}
