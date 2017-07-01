package SiddharthMay17;

import java.util.Scanner;

class ISSNAKE {
	static boolean ok = false;
	static int mark = 0, status = 0;
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
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < n; j++) {
					if (a[i][j] == '#') {
						ok = false;
						mark = 1;
						status = 0;
						for (int v = 0; v < 2; v++) {
							for (int k = 0; k < n; k++)
								visited[v][k] = false;
						}
						visited[i][j] = true;
						recurse(a, visited, count, i, j, n);
						if (ok) {
							i = 2;
							break;
						}

					}
				}
			}
			System.out.println(ok ? "yes" : "no");
		}
	}

	public static void recurse(char[][] a, boolean[][] vis, int count, int i, int j, int n) {
		if (count == mark && status == 0) {
			ok = true;
			return;
		}
		if (i < n && j + 1 < n && a[i][j + 1] == '#' && !vis[i][j + 1] && a[i][j] == '#') {
			vis[i][j + 1] = true;
			mark++;
			recurse(a, vis, count, i, j + 1, n);
		}
		if (i != 1) {
			if (i + 1 < n && j < n && a[i + 1][j] == '#' && !vis[i + 1][j] && a[i][j] == '#') {
				vis[i + 1][j] = true;
				mark++;
				recurse(a, vis, count, i + 1, j, n);
			}
		}
		if (i == 1) {
			if (i - 1 < n && j < n && a[i - 1][j] == '#' && !vis[i - 1][j] && a[i][j] == '#') {
				vis[i - 1][j] = true;
				mark++;
				recurse(a, vis, count, i - 1, j, n);
			}
		}
		if (i >= 0 && j - 1 >= 0 && a[i][j - 1] == '#' && !vis[i][j - 1] && a[i][j] == '#') {
			vis[i][j - 1] = true;
			mark++;
			recurse(a, vis, count, i, j - 1, n);
		}
		if (count == mark && status == 0) {
			ok = true;
			return;
		} else {
			ok = false;
			status++;
			return;
		}
	}
}
