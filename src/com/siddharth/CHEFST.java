package com.siddharth;

import java.util.Scanner;
import java.util.Stack;

class CHEFST {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 0; i < n - 1; i++) {
			System.out.print(" ");
		}
		Stack<Integer> s1 = new Stack<Integer>();
		System.out.print(1);
		System.out.println();
		int k = 2;
		for (int i = 1; i < n; i++) {
			for (int z = 0; z < n - i - 1; z++) {
				System.out.print(" ");
			}
			for (int j = k + i; j >= k; j--) {
				System.out.print(j);
				s1.push(j);

			}
			k = k + s1.size();
			while (!s1.isEmpty()) {
				int x = s1.peek();
				System.out.print((char) (x + 63));

				s1.pop();

			}
			System.out.println();

		}
		s.close();

	}

}
