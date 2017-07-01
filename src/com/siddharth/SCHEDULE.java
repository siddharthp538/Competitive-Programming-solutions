package com.siddharth;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
class SCHEDULE {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long t = s.nextLong();
		while (t-- > 0) {
			ArrayList<Integer> a = new ArrayList<>();
			long n = s.nextLong(), k = s.nextLong();
			String str = s.next();
			long zstart = 0, ostart = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != '0' && i % 2 == 0)
					zstart++;
				else if (str.charAt(i) != '1' && i % 2 == 1) {
					zstart++;
				}
			}
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != '1' && i % 2 == 0)
					ostart++;
				else if (str.charAt(i) != '0' && i % 2 == 1) {
					ostart++;
				}
 
			}
			int count = 1;
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.charAt(i) == str.charAt(i + 1)) {
					count++;
				} else {
					a.add(count);
					count = 1;
				}
			}
 
			a.add(count);
 
			if (ostart <= k || zstart <= k) {
				System.out.println(1);
			} else {
				Collections.sort(a);
 
				int temp = calculate(a, k);
 
				System.out.println(temp);
 
			}
 
		}
	}
 
	public static int calculate(ArrayList<Integer> a, long k) {
		int index = a.size() - 1;
		while (k-- > 0) {
			if (a.get(index) % 2 == 0 && a.get(index) != 2) {
				a.add(a.get(index) / 2);
				a.add((a.get(index) / 2) - 1);
				a.remove(index);
 
			} else if (a.get(index) % 2 == 1 && a.get(index) != 1) {
 
				a.add(a.get(index) / 2);
				a.add(a.get(index) / 2);
				a.remove(index);
				
			}
 
			Collections.sort(a);
			if (a.get(a.size() - 1) < 3)
				return a.get(a.size() - 1);
			index = a.size() - 1;
		}
 
		return a.get(a.size() - 1);
	}
 
}
 