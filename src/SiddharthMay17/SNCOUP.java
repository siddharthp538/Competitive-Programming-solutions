package SiddharthMay17;
/* Problem Name: Snakes and their coup against The mongoose 
   Problem Code: SNCOUP
   Contest: SnackDown Pre-Elimination Round B 2017
   Link: https://www.codechef.com/SNCKPB17/problems/SNCOUP
   author: siddharthp538
*/
import java.util.*;
import java.io.*;

class SNCOUP {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			char[][] a = new char[2][n];
			for (int i = 0; i < 2; i++) {
				String str = s.next();
				for (int j = 0; j < n; j++) {
					a[i][j] = str.charAt(j);
				}
			}
			int hoz = 0, vcount = 0, hcount = 0, ver = 0;
			for (int i = 0; i < n; i++) {
				if (a[0][i] == '*')
					vcount++;
				if (a[1][i] == '*')
					hcount++;
				if (vcount > 0 && hcount > 0 && hoz == 0)
					hoz++;
				if (vcount == 2 && hcount == 2) {
					ver++;
					hcount = 1;
					vcount = 1;

				} else if (vcount == 2) {
					ver++;
					vcount = 1;
					if (hcount == 1 && a[1][i] != '*')
						hcount = 0;
				} else if (hcount == 2) {
					ver++;
					hcount = 1;
					if (vcount == 1 && a[0][i] != '*')
						vcount = 0;
				}

			}
			sb.append((ver + hoz) + "\n");

		}
		System.out.println(sb);

	}

}

