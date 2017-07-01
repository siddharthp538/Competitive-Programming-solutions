package SiddharthMay17;

import java.util.Arrays;
import java.util.Scanner;

class MXMEDIAN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] ans = new int[n];
			int fin[] = new int[2 * n];
			int[] inp = new int[2 * n];
			for (int i = 0; i < 2 * n; i++) {
				inp[i] = s.nextInt();
			}
			Arrays.sort(inp);
			int len = n, index = 0;
			for (int i = 0; i < n; i++) {
				ans[i] = Math.max(inp[len], inp[i]);
				fin[index++] = inp[i];
				fin[index++] = inp[len];
				len++;
			}
			System.out.println(ans[ans.length / 2]);
			for (int i = 0; i < 2 * n; i++) {
				System.out.print(fin[i] + " ");
			}
			System.out.println();
		}

	}

}
