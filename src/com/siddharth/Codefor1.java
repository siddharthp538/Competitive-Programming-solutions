package com.siddharth;

import java.util.ArrayList;
import java.util.Scanner;

public class Codefor1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Long> a = new ArrayList<>();
		recurse(s.nextLong(), a);
		System.out.println(a);

	}

	public static void recurse(long n, ArrayList<Long> a) {

		if (n > 1) {
			recurse(n / 2, a);
			a.add(n % 2);
			recurse(n / 2, a);

		} else {
			a.add(n);
		}
	}

}
