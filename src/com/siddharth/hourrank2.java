package com.siddharth;

import java.util.Scanner;

public class hourrank2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();

		int[] ar = new int[str.length()];
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			ar[i] = Character.getNumericValue(str.charAt(i));
			if (ar[i] == 0)
				count++;
			else if (ar[i] % 2 == 0 && ar[i] % 3 == 0)
				count++;
		}
		int sum = 0, j = 0;
		count += SubArraySum(ar, str.length());
		//System.out.println(count);

	}

	static int SubArraySum(int arr[], int n) {
		int result = 0, count = 0;

		for (int i = 0; i < n; i++) {
			result = (arr[i] * (i + 1) * (n - i));
			if (result % 3 == 0) {
				System.out.println(result);
				count++;
			}

		}

		return count;
	}

}
