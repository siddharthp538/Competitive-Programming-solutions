package SiddharthMay17;
/* Problem Name: Same Snake 
   Problem Code: SAMESNAK
   Contest: SnackDown Qualifier Round 2017
   Link: https: https://www.codechef.com/SNCKQL17/problems/SAMESNAK
   author: siddharthp538
*/
import java.util.Scanner;

class SAMESNAK2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x1 = s.nextInt(), y1 = s.nextInt(), x2 = s.nextInt(), y2 = s.nextInt(), x3 = s.nextInt(),
					y3 = s.nextInt(), x4 = s.nextInt(), y4 = s.nextInt();
			if (x1 == x2 && y1 > y2) {
				int temp = y1;
				y1 = y2;
				y2 = temp;
			}
			if (y1 == y2 && x1 > x2) {
				int temp = x2;
				x1 = x2;
				x2 = temp;
			}
			if (y3 == y4 && x3 > x4) {
				int temp = x3;
				x3 = x4;
				x4 = temp;
			}
			if (x3 == x4 && y3 > y4) {
				int temp = y3;
				y3 = y4;
				y4 = temp;
			}
			boolean ok = false;
			if (y1 == y2 && y3 == y4) { // both vertical
				if (x1 > x3) {

					if (x4 >= x1)
						ok = true;

				} else {
					if (x2 >= x3)
						ok = true;
				}
			} else if (x1 == x2 && x3 == x4) { // both horizontal
				if (y3 > y1) {
					if (y2 >= y3)
						ok = true;
				} else {
					if (y4 >= y1)
						ok = true;

				}
			} else { // one vertical and one horizontal
				if ((x1 == x3 && y1 == y3) || (x2 == x3 && y2 == y3) || (x1 == x4 && y1 == y4)
						|| (x2 == x4 && y2 == y4))
					ok = true;
			}
			System.out.println(ok ? "yes" : "no");
		}

	}

}
