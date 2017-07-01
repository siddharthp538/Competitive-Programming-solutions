package SiddharthJUNE17;

import java.util.*;
import java.io.*;

class CLONING {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt(), q = s.nextInt();
			int ar[] = new int[n];
			for (int i = 0; i < n; i++)
				ar[i] = s.nextInt();
			while (q-- > 0) {
				int a = s.nextInt(), b = s.nextInt(), c = s.nextInt(), d = s.nextInt();

				PriorityQueue<Integer> pq1 = new PriorityQueue<>();
				PriorityQueue<Integer> pq2 = new PriorityQueue<>();
				for (int i = a - 1; i <= b - 1; i++)
					pq1.add(ar[i]);

				for (int i = c - 1; i <= d - 1; i++)
					pq2.add(ar[i]);
				int count = 0;
				for (int i = 0; i <= b - a; i++)
					if (pq1.poll() != pq2.poll())
						count++;

				System.out.println(count < 2 ? "YES" : "NO");
			}

		}

	}
}

class MyComp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return o2.intValue() - o1.intValue();

	}

}
