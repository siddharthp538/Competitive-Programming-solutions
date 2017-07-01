package SiddharthMay17;
/* Problem Name: Prefix Inversions
   Problem Code: PREFINVS
   Contest: May Lunchtime 2017
   Link: https:https://www.codechef.com/LTIME48/problems/PREFINVS/
   author: siddharthp538
*/
import java.util.Scanner;

class PREFIX {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int n = str.length();
		int count = 0, i = n - 1;
		char curr = '0';
		char[] a = str.toCharArray();
		while (i >= 0) {
			if (i >= 0 && a[i] == '1') {
				count++;
				while (i >= 0 && a[i] == '1') {
					i--;
				}
			}
			if (i >= 0 && a[i] == '0') {

				if (count != 0)
					count++;
				while (i >= 0 && a[i] == '0') {
					i--;
				}
			}

		}
		System.out.println(count);

	}

}
