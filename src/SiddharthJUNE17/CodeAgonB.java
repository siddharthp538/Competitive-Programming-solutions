package SiddharthJUNE17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CodeAgonB {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), k = s.nextInt();
		Pairs[] a = new Pairs[k];
		for (int i = 0; i < k; i++)
			a[i] = new Pairs(s.nextInt(), s.nextInt());
		Arrays.sort(a, new MyComparator());
		long ans = 0, remain = n;
		for (int i = k - 1; i >= 0; i--) {
			if (a[i].x <= remain) {
				ans += a[i].y * a[i].x;
				remain -= a[i].x;
			} else {
				ans += remain * a[i].y;
				break;
			}
		}
		System.out.println(ans);
	}

}

class Pairs {
	int x, y;

	Pairs(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class MyComparator implements Comparator<Pairs> {
	public int compare(Pairs o1, Pairs o2) {
		if (o1.y <= o2.y)
			return -1;

		return 1;

	}

}
