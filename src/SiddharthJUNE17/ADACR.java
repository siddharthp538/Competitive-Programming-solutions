package SiddharthJUNE17;

import java.util.Scanner;

class ADACR {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			String str = s.next();
			int uc = 1, dc = 0, fu = 0, fd = 0;
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.charAt(i) == str.charAt(i + 1)) {
					if (str.charAt(i) == 'U')
						uc++;
					else
						dc++;
				} else {
					if (uc >= 1 && str.charAt(i) == 'U') {
						fu++;
						uc = 1;
					} else {
						fd++;
						dc = 0;
					}
				}
			}
			if (uc >= 1 && str.charAt(str.length()-1) == 'U') {
				fu++;
				uc = 1;
			} else {
				fd++;
				dc = 0;
			}
			System.out.println(Math.min(fu, fd));

		}
	}

}
