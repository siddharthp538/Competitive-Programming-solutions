package SiddharthJUNE17;

import java.util.ArrayList;
import java.util.Scanner;

class UNIONSET {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			int n = s.nextInt();
			long count = 0;
			int k = s.nextInt();
			int[][] a = new int[n][k + 1];
			for (int i = 0; i < n; i++) {
				int x = s.nextInt();
				a[i][0] = x;
				while (x-- > 0) {
					int element = s.nextInt();
					a[i][element] = element;
				}
			}
			for (int i = 0; i < n; i++) {
				ArrayList<Integer> not_touched = new ArrayList<>();
				for (int o = 1; o <= k; o++)
					if (a[i][o] == 0)
						not_touched.add(o);
				for (int j = i + 1; j < n; j++) {
					if ((a[j][0] + a[i][0]) < k)
						continue;
					else if ((a[j][0] + a[i][0]) > 2 * (k - 1)) {
						count++;
						continue;
					}
					int b = 0;
					for (b = 0; b < not_touched.size(); b++)
						if (a[j][not_touched.get(b)] == 0)
							break;

					if (b == not_touched.size())
						count++;

				}
			}
			sb.append(count + "\n");

		}
		System.out.println(sb);

	}

}
