package com.siddharth;

import java.util.HashMap;
import java.util.Scanner;

public class RegistrationSystem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		int t = s.nextInt();
		while (t-- > 0) {
			String str = s.next();
			if (!map.containsKey(str)) {
				System.out.println("OK");
				map.put(str, 0);
			} else {
				System.out.println(str + (map.get(str) + 1));

				map.put(str, 1 + map.get(str));

			}
		}
		s.close();

	}

}
