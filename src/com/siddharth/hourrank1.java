package com.siddharth;

import java.util.Scanner;

public class hourrank1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int t = s.nextInt();
		int fin_pos = m;
		int a = s.nextInt();
		int b = s.nextInt();
		if (a == m) {
			fin_pos = b;
		} else if (b == m) {
			fin_pos = a;
		}
		while (t-- > 1) {
			int x = s.nextInt();
			int y = s.nextInt();
			if (x == fin_pos)
				fin_pos = y;
			else if (y == fin_pos)
				fin_pos = x;
		}
		System.out.println(fin_pos);
	}

}
