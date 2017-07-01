package com.siddharth;
//cook79
import java.util.ArrayList;
import java.util.Scanner;

 class Chairs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String str = s.next();
			int zc = 0;
			ArrayList<Integer> a = new ArrayList<>();
			int count = 0, i = 0;
			for (i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '0')
					zc++;
			}
			for (i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '1') {
					a.add(count);
					count = 0;

				} else
					count++;
			}
			a.add(count);
			i = 0;
			char last_element = str.charAt(str.length() - 1);
			if (last_element == '0') {
				count = 0;
				int temp = a.get(a.size()-1);
				while (str.charAt(i) != '1') {
					count++;
					i++;
				}
				temp += count;
				a.add(0, temp);
			}
			int max = Integer.MIN_VALUE;
			for (i = 0; i < a.size(); i++) {
				max = Math.max(max, a.get(i));
			}
			System.out.println(zc - max);
		}

	}

}
