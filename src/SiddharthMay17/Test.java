package SiddharthMay17;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = 0;
		for (int i = 1; i <= n; i++) {
			k += i;
			int a = k;
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int x = 0; x < i; x++)
				System.out.print((char) (64 + (a--)));
			System.out.println();
		}
	}

}
