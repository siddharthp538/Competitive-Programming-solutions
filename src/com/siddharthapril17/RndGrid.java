package com.siddharthapril17;

import java.util.Scanner;

class RndGrid {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int l = s.nextInt(), n = s.nextInt();
			String str = s.next();
			char[][] a = new char[n][n];
			for (int i = 0; i < n; i++) {
				String d = s.next();
				for (int j = 0; j < n; j++) {
					a[i][j] = d.charAt(j);
				}
			}
			int count = 0;
			int ans = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (count == l) {
						ans ^= count;
					}
					count = 0;
					if (a[i][j] == '.') {
						int curleft = i, curright = j;
						for (int k = 0; k < l; k++) {
							if (str.charAt(k) == 'R') {
								if (curright + 1 < n && a[curleft][curright + 1] == '.') {
									count++;

									curright = curright + 1;
								} else {
									ans ^= count;
									break;
								}
							} else if (str.charAt(k) == 'U') {
								if (curleft - 1 >= 0 && a[curleft - 1][curright] == '.') {
									count++;
									curleft = curleft - 1;

								} else {
									ans ^= count;
									break;
								}
							} else if (str.charAt(k) == 'D') {
								if (curleft + 1 < n && a[curleft + 1][curright] == '.') {
									count++;
									curleft += 1;
								} else {
									ans ^= count;
									break;
								}
							} else if (str.charAt(k) == 'L') {
								if (curright - 1 >= 0 && a[curleft][curright - 1] == '.') {
									count++;
									curright -= 1;
								} else {
									ans ^= count;
									break;
								}
							}

						}

					}

				}
			}
			System.out.println(ans);
		}
	}

}
