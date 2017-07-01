package com.siddharth;

//adjacencymatrix
import java.util.Scanner;

public class kthdivisor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nodes = s.nextInt(), x, y;
		int edges = s.nextInt();
		int[][] adj = new int[nodes][nodes];
		Initialise(adj);
		for (int i = 0; i < edges; i++) {
			x = s.nextInt();
			y = s.nextInt();

			adj[x - 1][y - 1] = 1;
			adj[y - 1][x - 1] = 1;

		}
		int queries = s.nextInt();
		while (queries-- > 0) {
			x = s.nextInt();
			y = s.nextInt();
			if (x == y)
				System.out.println("No edge between same points");
			else if (adj[x - 1][y - 1] == 1 || adj[y - 1][x - 1] == 1)
				System.out.println("Yes,There is an edge between " + x + " and " + y);
			else
				System.out.println("No,Disconnected vertices");

		}

		s.close();

	}

	public static void Initialise(int[][] a) {
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++)
				a[i][j] = 0;
		}
	}

}
