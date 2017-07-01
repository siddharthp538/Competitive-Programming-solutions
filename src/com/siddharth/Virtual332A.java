package com.siddharth;

import java.util.Scanner;

public class Virtual332A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int d1 = s.nextInt();
		int d2 = s.nextInt();
		int d3 = s.nextInt();
		long path1 = d1 + d2 + d3;
		long path2 = (2 * d1) + (2 * d2);
		long path3 = (2 * d1) + (2 * d3);
		long path4 = (2 * d2) + (2 * d3);
		System.out.println(Math.min(Math.min(path1, path2), Math.min(path3, path4)));

	}

}
