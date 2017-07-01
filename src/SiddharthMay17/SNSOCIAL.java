package SiddharthMay17;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

class SNSOCIAL {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), m = in.nextInt();
			int max = 0, count = 0;
			int[][] a = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = in.nextInt();
					if (a[i][j] > max) {
						max = a[i][j];
						count = 1;
					} else if (a[i][j] == max)
						count++;
				}
			}
			Point[] A = new Point[count];
			int index = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++)
					if (a[i][j] == max)
						A[index++] = new Point(i, j);

			}

			int max_ans = 0;
			int maximum = Math.max(Math.abs(n - 1), Math.abs(m - 1));
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (a[i][j] != max) {
						int min_ans = Integer.MAX_VALUE;
						for (int v = 0; v < count; v++) {
							min_ans = Math.min(Math.max(Math.abs(A[v].x - i), Math.abs(A[v].y - j)), min_ans);
							if (min_ans == 1)
								break;
						}
						max_ans = Math.max(max_ans, min_ans);
						if (maximum == max_ans) {
							max_ans = maximum;
							j = m;
							i = n;
							break;

						}
					}
				}
			}
	         System.out.println(max_ans);
		}
		in.close();

	}

}

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

