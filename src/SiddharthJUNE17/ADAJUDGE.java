package SiddharthJUNE17;

import java.util.Scanner;

class ADAJUDGE {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			System.out.println(n);

			for (int i = 1; i <= n - 1; i++) {
				System.out.println(n);
				int k = i;
				for (int j = 1; j <= n - 1; j++) {
					System.out.println(j + " " + k + " " + (k + 1));
				}
				System.out.println(n + " " + k + " " + (k + 1));
			}
			System.out.println(n);
			for (int i = 1; i <= n; i++) {
				System.out.println(i + " " + 1 + " " + n);
			}

		}

	}

}
