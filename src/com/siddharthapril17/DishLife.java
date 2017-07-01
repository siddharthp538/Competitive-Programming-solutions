package com.siddharthapril17;


import java.util.Scanner;

class DishLife {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int q = s.nextInt();
			int n = s.nextInt();
			boolean[] ans = new boolean[n + 1];
			ans[0] = true;
			boolean yes = false;
			while (q-- > 0) {
				int a = s.nextInt();
				while (a-- > 0) {
					int temp = s.nextInt();
					
					
					ans[temp] = true;

				}
				yes = check(ans);
				if (yes)
					break;

			}
			if (yes && q == 0) {
				System.out.println("all");
			} else if (yes && q != 0) {
				while (q-- > 0) {
					int a = s.nextInt();
					while (a-- > 0) {
						int temp = s.nextInt();
						ans[temp] = true;

					}
				}
				System.out.println("some");

			} else {
				System.out.println("sad");
			}

		}
	}

	public static boolean check(boolean[] temp) {
		for (int i = 0; i < temp.length; i++) {
			if (!temp[i])
				return false;
		}
		return true;
	}

}
