package com.siddharthapril17;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class QA1B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int tc = 0;
		while (t-- > 0) {
			HashMap<Double, Long> map2 = new HashMap<>();
			HashMap<Long, Long> map = new HashMap<>();
			long dest = s.nextInt();
			int n = s.nextInt();
			long[] pos = new long[n];
			long[] start = new long[n];
			int index = 0, temp = n;
			double[] pd = new double[n];
			while (temp-- > 0) {
				start[index] = s.nextInt();
				pos[index] = s.nextInt();
				pd[index] = (double) (dest - start[index]) / (double) pos[index];
				map2.put((double) (dest - start[index]) / (double) pos[index], start[index]);
				map.put(start[index], pos[index]);
				index++;

			}
			Arrays.sort(pd);
			long min = map2.get(pd[pd.length - 1]);

			long check = dest - min;
			long check_ = map.get(min);
			min = check / check_;
			if (check % check_ != 0) {
				min++;
			}

			
			double ans = dest / (double) min;
			System.out.print("Case #" + (++tc) + ": ");
			System.out.print(String.format("%.6f", new BigDecimal(String.valueOf(ans))));
			System.out.println();

		}

	}

}
