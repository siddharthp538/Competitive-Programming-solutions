package SiddharthMay17;

import java.util.Scanner;

class SNELECT {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int scount = 0, mcount = 0, i;
			String str = s.next();
			for (i = 0; i < str.length() - 1; i++) {
				if ((str.charAt(i) == 's' && str.charAt(i + 1) == 'm')
						|| (str.charAt(i) == 'm' && str.charAt(i + 1) == 's')) {
					mcount++;
					i++;
				} else if (str.charAt(i) == 's')
					scount++;
				else
					mcount++;

			}
			if (i == str.length() - 1) {
				if (str.charAt(i) == 's')
					scount++;
				else
					mcount++;
			}
			if (mcount == scount)
				System.out.println("tie");
			else if (mcount > scount) {
				System.out.println("mongooses");
			} else
				System.out.println("snakes");
		}
	}

}
