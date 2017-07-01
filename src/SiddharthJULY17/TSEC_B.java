package SiddharthJULY17;

import java.util.HashMap;
import java.util.Scanner;

class TSEC_B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String[][] a = new String[n][2];
			HashMap<String, String> map = new HashMap<>();
			HashMap<String, String> map1 = new HashMap<>();
			for (int i = 0; i < n; i++) {
				a[i][0] = s.next();
				a[i][1] = s.next();
				map.put(a[i][0], a[i][1]);
				map1.put(a[i][1], a[i][0]);
			}
			String temp = null;
			int index = 0, i = 0;
			for (i = 0; i < n; i++) {
				index = search(a[i][0], a, n);
				if (index == -1) {
					temp = new String(a[i][0]);
					break;
				}
			}

			while (true) {
				System.out.print(temp + " ");
				if (!map.containsKey(temp))
					break;
				else {
					System.out.print(map.get(temp) + " ");
					if (!map.containsKey(map.get(temp)))
						break;
					temp = new String(map.get(map.get(temp)));
				}
			}
			System.out.println();
		}
	}

	public static int search(String str2, String[][] a, int n) {
		for (int i = 0; i < n; i++) {
			if (str2.equals(a[i][1]))
				return i;
		}
		return -1;
	}

}
