package com.siddharth;

import java.util.Scanner;

public class CielAndFlowers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*
		 * long r = s.nextLong(); long b = s.nextLong(); long g = s.nextLong();
		 * if (r < 3 && b < 3 && g < 3) System.out.println(0);
		 * 
		 * else if(r==0 ) System.out.println((g/3)+(b/3)); else if(g==0)
		 * System.out.println((r/3)+(b/3)); else if(b==0)
		 * System.out.println((r/3)+(g/3)); else {
		 * 
		 * long remaining = (r / 3) + (b / 3) + (g / 3); long remain =
		 * Math.max(Math.max(r % 3, b % 3), g % 3); remain = ((r - remain) / 3)
		 * + ((b - remain) / 3) + ((g - remain) / 3) + remain; if (r % 3 != 0 &&
		 * g % 3 != 0 && b % 3 != 0) remaining += ((r % 3) + (b % 3) + (g % 3))
		 * / 3; // System.out.println(); System.out.println(Math.max(remain,
		 * Math.max(remaining, Math.min(Math.min(r, g), b)))); }
		 */
		int i = 1;
		System.out.print(++i + " " + ++i + " " + i);
	}

}
