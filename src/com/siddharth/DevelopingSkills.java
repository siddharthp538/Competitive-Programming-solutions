package com.siddharth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//41
public class DevelopingSkills {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		long n=s.nextLong();
		long k=s.nextLong();
		int[] a = new int[(int)n];
		ArrayList<Integer> mod = new ArrayList<>();
		long count = 0, res = 0;
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();

			count += a[i] / 10;
			if (a[i] < 100) {
				mod.add(a[i] % 10);
				a[i] += 10 - (a[i] % 10);
			}

		}
		Collections.sort(mod);
		for (int i = mod.size() - 1; i >= 0; i--) {
			if (10 - mod.get(i) <= k) {
				k -= 10 - mod.get(i);
				count++;
			} else
				break;
		}
		for (int i = 0; i < a.length; i++) {
			res += 100 - a[i];
		}
		if (res < k)
			k = res;
		count += k / 10;
		System.out.println(count);
		s.close();

	}
}
