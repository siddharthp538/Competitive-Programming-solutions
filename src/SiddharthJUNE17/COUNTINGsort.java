package SiddharthJUNE17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class COUNTINGsort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		ArrayList<String> a[] = new ArrayList[1000005];
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i <= 1000000; i++)
			a[i] = new ArrayList<>();
		int count = 1, half = t / 2, number = t, max = Integer.MIN_VALUE;
		while (t-- > 0) {
			int n = s.nextInt();
			String str = s.next();
			if (count <= half)
				map.put(str, str);
			a[n].add(str);
			max = Math.max(max, n);
			count++;
		}
		for (int i = 0; i <= max; i++) {
			for (int j = 0; j < a[i].size(); j++) {
				if (map.containsKey(a[i].get(j)))
					System.out.print("- ");
				else
					System.out.print(a[i].get(j) + " ");

			}
		}
	}

}
