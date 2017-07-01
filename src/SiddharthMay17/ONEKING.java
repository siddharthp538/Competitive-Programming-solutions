package SiddharthMay17;
/* Problem Name: One Dimensional Kingdoms 
   Problem Code: ONEKING
   Contest: Practice-Medium
   Link: https: https://www.codechef.com/problems/ONEKING
   author: siddharthp538
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class ONEKING {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			ArrayList<interval> a = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				interval temp = new interval(s.nextInt(), s.nextInt());
				a.add(temp);
			}

			Collections.sort(a, new MyComparator());
			int count = 1;

			int x1 = a.get(0).start, x2 = a.get(0).end;
			for (int i = 1; i < n; i++) {
				int y1 = a.get(i).start, y2 = a.get(i).end;
				if (!(x1 <= y2 && y1 <= x2)) { // check if they overlap
					x1 = y1;
					x2 = y2;
					count++;
				}

			}
			System.out.println(count);

		}

	}

}

class interval {
	int start, end;

	public interval(int start, int end) {
		this.start = start;
		this.end = end;

	}
}

class MyComparator implements Comparator<interval> {

	public int compare(interval arg0, interval arg1) {
		if (arg0.end <= arg1.end)
			return -1;
		else
			return 1;

	}

}
