package SiddharthMay17;
/* Problem Name: Team Formation For Snackdown 
   Problem Code: TEAMFORM
   Contest: SnackDown Pre-Elemination Round A
   Link: https://www.codechef.com/SNCKPA17/problems/TEAMFORM
   author: siddharthp538
*/
import java.util.Scanner;

class TEAMFORM {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt(), m = s.nextInt();
			while (m-- > 0) {
				int u = s.nextInt(), v = s.nextInt();
			}
			if ((n - (2 * m)) % 2 == 0)
				System.out.println("yes");
			else
				System.out.println("no");

		}
	}

}
