package SiddharthMay17;

import java.util.Scanner;

class ISSNAKE2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			char[][] a = new char[2][n];
			boolean[][] visited = new boolean[2][n];
			int count = 0;
			for (int i = 0; i < 2; i++) {
				String str = s.next();
				for (int j = 0; j < n; j++) {
					a[i][j] = str.charAt(j);
					if (a[i][j] == '#')
						count++;
				}
			}
			if (recurse(a, visited, count, 0, 0, n, 0))
				System.out.println("yes");
			else
				System.out.println("no");

		}

	}

	public static boolean recurse(char[][] a, boolean[][] vis, int count, int i, int j, int n, int mark) {
		if (count == mark) {
			return true;
		}
		if (i < n && j + 1 < n && a[i][j + 1] == '#' && !vis[i][j + 1]) {
			vis[i][j + 1] = true;
			mark++;
			return recurse(a, vis, count, i, j + 1, n, mark);

		}
		if (i + 1 < n && j < n && a[i + 1][j] == '#' && !vis[i + 1][j]) {
			vis[i + 1][j] = true;
			mark++;
			return recurse(a, vis, count, i + 1, j, n, mark);
		}
		if (count == mark) {
			return true;
		} else
			return false;

	}

}
