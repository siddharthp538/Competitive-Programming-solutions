package SiddharthJULY17;

import java.util.HashMap;
import java.util.Scanner;

class TSEC_A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char[] a = str.toCharArray();
		long count = 1;
		long ans = 0;
		HashMap<Long, Long> map = new HashMap<>();
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				ans = count * (a[i] - 96);
				map.put(ans, ans);
				count++;

			} else {
				ans = count * (a[i] - 96);
				map.put(ans, ans);
				count = 1;

			}

		}

		ans = count * (a[a.length - 1] - 96);
		map.put(ans, ans);
		count = 1;
		int n = s.nextInt();
		while (n-- > 0) {
			long temp = s.nextLong();
			if (map.containsKey(temp))
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

}
