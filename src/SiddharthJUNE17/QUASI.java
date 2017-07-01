package SiddharthJUNE17;

import java.util.Scanner;

public class QUASI {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int len = Integer.toString(n).length();
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < (1 << len); i++) {

			StringBuilder sb = new StringBuilder();
			int index = 0, temp = 0;
			for (int j = n - 1; j >= 0; j--) {
				sb.append((i / (1 << j)) % 2 + " ");
			}
			if (sb.charAt(0) == '1') {
				index = Integer.parseInt(sb.toString());
				temp = n - ((n / index) * index) + (n / index);
				if (temp < ans)
					ans = index;
			}
		}
	}

}
