package com.siddharth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class KickStart17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int x = 1;
		while (t-- > 0) {
			int n = s.nextInt();
			s.nextLine();
			HashMap<Integer, ArrayList<String>> m1 = new HashMap<>();
			ArrayList<Integer> a = new ArrayList<>();
			while (n-- > 0) {
				String str = s.nextLine();
				HashSet<Character> set = new HashSet<Character>();

				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) != 32)
						set.add(str.charAt(i));
               	}
				if (!m1.containsKey(set.size())) {
					ArrayList<String> astr = new ArrayList<>();
					astr.add(str);
					m1.put(set.size(), astr);
					a.add(set.size());
				} else {
					m1.get(set.size()).add(str);
				}

				set.clear();

			}
			Collections.sort(a);
			ArrayList<String> temp = new ArrayList<>(m1.get(a.get(a.size() - 1)));
			List<String> temp1 = temp.subList(0, temp.size());
			Collections.sort(temp1);
			System.out.println("Case #" + x++ + ": " + temp1.get(0));

		}
	}

}
