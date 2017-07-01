package SiddharthJUNE17;

import java.io.*;
import java.util.*;

class LTimeB {
	public static void main(String[] args) {
		InputReader s = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];

			for (int i = 0; i < n; i++)
				a[i] = s.nextInt();
			for (int i = 0; i < n; i++)
				b[i] = s.nextInt();
			long[] pre = new long[n];
			pre[0] = b[0];
			for (int i = 1; i < n; i++)
				pre[i] = pre[i - 1] + b[i];
			int ptr1 = 0, ptr2 = 0;
			HashSet<Integer> set = new HashSet<>();
			long max = 0;
			while (ptr2 < n) {
				set.add(a[ptr2]);
				if (set.size() == ptr2 - ptr1 + 1) {
					if (ptr1 == 0)
						max = Math.max(max, pre[ptr2 - ptr1]);
					else
						max = Math.max(max, pre[ptr2] - pre[ptr1 - 1]);
					ptr2++;
				} else {
					set.remove(a[ptr1]);
					ptr1++;

				}
			}
			w.println(max);
		}
		w.close();
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