package SiddharthMay17;
/* Problem Name: Chef and his daily routine
   Problem Code: CHEFROUT
   Contest: May long challenge 2017
   Link: https://www.codechef.com/MAY17/problems/CHEFROUT
   author: siddharthp538
*/
import java.util.Scanner;

class CHEFROUT {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			String str = s.next();
			char temp = str.charAt(0);
			boolean ok = true;
			int len = str.length();
			for (int i = 1; i < len; i++) {
				if (temp <= str.charAt(i)) {
					temp = str.charAt(i);
				} else {
					ok = false;
					break;
				}

			}
			System.out.println(ok ? "yes" : "no");

		}
		s.close();
	}

}
