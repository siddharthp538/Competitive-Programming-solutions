package com.siddharth;

import java.util.Scanner;

public class Itsa1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			long ans = (n * (n + 1)) / 2;

			System.out.println(++ans);
		}
	}
}
