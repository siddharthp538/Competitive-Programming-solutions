package SiddharthJULY17;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class TSEC_F {
	public static void main(String[] args) {
		InputReader s = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		int t = s.nextInt();
		while (t-- > 0) {
			int k = s.nextInt(), n = s.nextInt();
			int[] a = new int[n];
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			for (int i = 0; i < n; i++)
				a[i] = s.nextInt();
			for (int i = 0; i < k - 1; i++) {
				w.print(-1 + " ");
				pq.add(a[i]);
			}

			Queue<Integer> al = new LinkedList<>();

			for (int i = k - 1; i < n; i++) {
				pq.add(a[i]);
				for (int j = 0; j <= k - 2; j++) {
					al.add(pq.poll());
				}
				w.print(pq.peek() + " ");
				while (!al.isEmpty()) {
					pq.add(al.poll());
				}
			}
			w.println();

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