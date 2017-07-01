package SiddharthMay17;

import java.util.Scanner;

class SANDWICH {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			long n = s.nextLong(), k = s.nextLong();
			;
			long m = s.nextLong();
			double ans = Math.ceil(n / k);
			long i, temp;

			for (i = 1; i <= k; i++) {

			}

			long fin = k - i + 1;
			fin = fin * (fin + 1) / 2;
			fin = fin % m;
			System.out.print((long) ans + " " + fin);
			System.out.println();

		}
	}

}
