package SiddharthMay17;

import java.util.*;
import java.io.*;

class SNCOUP {
	public static void main(String[] args) {
		InputReader s = new InputReader(System.in);

		StringBuilder sb = new StringBuilder();
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			char[][] a = new char[2][n];
			for (int i = 0; i < 2; i++) {
				String str = s.readString();
				for (int j = 0; j < n; j++) {
					a[i][j] = str.charAt(j);
				}
			}
			int hoz = 0, vcount = 0, hcount = 0, ver = 0;
			for (int i = 0; i < n; i++) {
				if (a[0][i] == '*')
					vcount++;
				if (a[1][i] == '*')
					hcount++;
				if (vcount > 0 && hcount > 0 && hoz == 0)
					hoz++;
				if (vcount == 2 && hcount == 2) {
					ver++;
					hcount = 1;
					vcount = 1;

				} else if (vcount == 2) {
					ver++;
					vcount = 1;
					if (hcount == 1 && a[1][i] != '*')
						hcount = 0;
				} else if (hcount == 2) {
					ver++;
					hcount = 1;
					if (vcount == 1 && a[0][i] != '*')
						vcount = 0;
				}

			}
			sb.append((ver + hoz) + "\n");

		}
		System.out.println(sb);

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

// Comments
