package SiddharthMay17;
/* Problem Name: Philospher's Stone 
   Problem Code: BYTESM2
   Contest: Practice-SPOJ-DP
   Link: https: http://www.spoj.com/problems/BYTESM2/
   author: siddharthp538
*/
import java.util.*;
import java.io.*;

class PhilStone {
	public static void main(String[] args) {

		InputReader s = new InputReader(System.in);
		PrintWriter w=new PrintWriter(System.out);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt(), m = s.nextInt();
			int[][] dp = new int[n][m];
			int[][] a = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = s.nextInt();
					dp[i][j] = -1;

				}
			}
			int c = 0;
			for (int i = 0; i < m; i++) {
				solve(0, c, n, m, 0, a, dp);
				c++;
			}
			int ans = Integer.MIN_VALUE;
			for (int i = 0; i < m; i++) {
				ans = Math.max(dp[0][i], ans);

			}
			w.println(ans);

		}
		 w.close();
	}

	public static int solve(int i, int j, int n, int m, int sum, int[][] a, int dp[][]) {
		sum = 0;
		int ans1 = 0, ans2 = 0, ans3 = 0;
		if (i == n || j == m)
			return sum;
		if (dp[i][j] != -1)
			return dp[i][j];
		sum += a[i][j];
		if (valid(i + 1, j - 1, n, m))
			ans1 = solve(i + 1, j - 1, n, m, sum, a, dp) + a[i][j];

		if (valid(i + 1, j, n, m))
			ans2 = solve(i + 1, j, n, m, sum, a, dp) + a[i][j];

		if (valid(i + 1, j + 1, n, m))
			ans3 = solve(i + 1, j + 1, n, m, sum, a, dp) + a[i][j];

		dp[i][j] = Math.max(Math.max(ans1, ans2), ans3);
		return dp[i][j];

	}

	static boolean valid(int i, int j, int n, int m) {
		if (i == -1 || j == -1)
			return false;

		return true;
	}

	
}

class InputReader {

	private final InputStream st;
	private final byte[] buf = new byte[8192];
	private int cc, sc;
	private SpaceCharFilter f;

	public InputReader(InputStream st) {
		this.st = st;
	}

	public int t() {
		if (sc == -1)
			throw new InputMismatchException();
		if (cc >= sc) {
			cc = 0;
			try {
				sc = st.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (sc <= 0)
				return -1;
		}
		return buf[cc++];
	}

	public int nextInt() {
		int c = t();
		while (isSpaceChar(c)) {
			c = t();
		}
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = t();
		}
		int res = 0;
		do {
			res *= 10;
			res += c - '0';
			c = t();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public long nextLong() {
		int c = t();
		while (isSpaceChar(c)) {
			c = t();
		}
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = t();
		}
		long res = 0;
		do {
			res *= 10;
			res += c - '0';
			c = t();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public int[] nextIntArray(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		return a;
	}

	public String readString() {
		int c = t();
		while (isSpaceChar(c)) {
			c = t();
		}
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = t();
		} while (!isSpaceChar(c));
		return res.toString();
	}

	public String nextLine() {
		int c = t();
		while (isSpaceChar(c))
			c = t();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = t();
		} while (!isEndOfLine(c));
		return res.toString();
	}

	public boolean isSpaceChar(int c) {
		if (f != null)
			return f.isSpaceChar(c);
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	private boolean isEndOfLine(int c) {
		return c == '\n' || c == '\r' || c == -1;
	}

	public interface SpaceCharFilter {
		public boolean isSpaceChar(int ch);
	}
}
