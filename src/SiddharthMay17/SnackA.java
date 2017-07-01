package SiddharthMay17;
/* Problem Name: Snake Procession
   Problem Code: SNAKPROC
   Contest: SnackDown Online Qualifier 2017
   Link: https: https://www.codechef.com/SNCKQL17/problems/SNAKPROC
   author: siddharthp538
*/
import java.util.Scanner;

class SnackA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			boolean ok = true;
			int count = 0;
			String str = s.next();
			for (int i = 0; i < n; i++) {

				if (str.charAt(i) != '.') {
					if (count % 2 == 0 && str.charAt(i) != 'H') {
						ok = false;
						break;
					} else if (count % 2 == 1 && str.charAt(i) != 'T') {
						ok = false;
						break;
					}
					count++;
				}
			}
			System.out.println(count % 2 == 0 && ok ? "Valid" : "Invalid");

		}
		s.close();
	}

}
