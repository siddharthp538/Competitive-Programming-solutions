package com.siddharth;

import java.util.Scanner;

public class ABTraining {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		if((a>1 && b>0) || (b>1 && a>0))
		{
		if (a * 2 <= b || b * 2 <= a) {
			System.out.println(Math.min(a, b));
		} else {
			System.out.println((a+b)/3);

		}
		
		}
		else
			System.out.println(0);

	 s.close();
	}

}
