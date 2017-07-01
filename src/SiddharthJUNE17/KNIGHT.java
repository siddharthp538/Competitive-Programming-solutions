package SiddharthJUNE17;

import java.util.Scanner;

class KNIGHT {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt(), m = s.nextInt();
			int[][] a = new int[n][m];
			boolean[][] vis = new boolean[n][m];
			int count = 0;
			if (n == 1 || n == 2) {
				for (int i = 0; i < 1; i++) {
					for (int j = 0; j < m; j++) {
						if ((i + 1) >= 0 && (i + 1) < n && (j + 2) < m && (j + 2) >= 0 && !vis[i + 1][j + 2]) {
							count++;
							vis[i + 1][j + 2] = true;
							vis[i][j] = true;
						}
						if ((i - 1) >= 0 && (i - 1) < n && (j + 2) < m && (j + 2) >= 0 && !vis[i - 1][j + 2]) {
							count++;
							vis[i - 1][j + 2] = true;
							vis[i][j] = true;
						}
						if ((i + 1) >= 0 && (i + 1) < n && (j - 2) >= 0 && (j - 2) < m && !vis[i + 1][j - 2]) {
							count++;
							vis[i + 1][j - 2] = true;
							vis[i][j] = true;
						}
						if ((i - 1) >= 0 && (i - 1) < n && (j - 2) < m && (j - 2) >= 0 && !vis[i - 1][j - 2]) {
							count++;
							vis[i - 1][j - 2] = true;
							vis[i][j] = true;
						}
					}
				}
			} else {
				for (int i = 1; i < 2; i++) {
					for (int j = 0; j < m; j++) {
						if ((i + 1) >= 0 && (i + 1) < n && (j + 2) < m && (j + 2) >= 0 && !vis[i + 1][j + 2]) {
							count++;
							vis[i + 1][j + 2] = true;
							vis[i][j] = true;
						}
						if ((i - 1) >= 0 && (i - 1) < n && (j + 2) < m && (j + 2) >= 0 && !vis[i - 1][j + 2]) {
							count++;
							vis[i - 1][j + 2] = true;
							vis[i][j] = true;
						}
						if ((i + 1) >= 0 && (i + 1) < n && (j - 2) >= 0 && (j - 2) < m && !vis[i + 1][j - 2]) {
							count++;
							vis[i + 1][j - 2] = true;
							vis[i][j] = true;
						}
						if ((i - 1) >= 0 && (i - 1) < n && (j - 2) < m && (j - 2) >= 0 && !vis[i - 1][j - 2]) {
							count++;
							vis[i - 1][j - 2] = true;
							vis[i][j] = true;
						}
					}
				}
			}
			System.out.println(count);
		}

	}

}