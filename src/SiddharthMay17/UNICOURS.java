package SiddharthMay17;
/* Problem Name: Courses in an university 
   Problem Code: UNICOURS
   Contest: May Long Challenge 2017
   Link: https://www.codechef.com/MAY17/problems/UNICOURS
*/
import java.util.Scanner;

class UNICOURS {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			int count = 0;
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				if (a[i] > count)
					count += a[i] - count;
			}
			
			System.out.println(n - count);

		}
	}

}
