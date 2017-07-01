package SiddharthMay17;

import java.util.Scanner;

class WSITES01A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = { 1, 2, 3, 4 };
		update(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

	}

	static void update(int[] a) {
		for (int i = 0; i < a.length; i++)
			a[i] += 1;
	}

}
