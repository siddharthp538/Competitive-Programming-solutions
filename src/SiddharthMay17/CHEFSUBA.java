package SiddharthMay17;

import java.util.Scanner;

class CHEFSUBA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), k = s.nextInt(), p = s.nextInt();
		if (k > n)
			k = n;
		int[] freq = new int[n + 1];
		int[] a = new int[2 * n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			a[i + n] = a[i];
		}
		String str = s.next();
		int[] sum = new int[2 * n];
		int index = n, sumv = 0;
		for (int i = 0; i < k; i++) {
			sumv += a[i];
		}
		sum[index++] = sumv;
		freq[sumv]++;
		int max = sumv, temp = sumv;
		for (int i = k; i < n; i++) {
			sumv += a[i] - a[i - k];
			freq[sumv]++;
			sum[index++] = sumv;
			max = Math.max(max, sumv);
		}
		index--;
		int ind1 = n + k - 1, ind2 = (2 * n) - 1, ind3 = n - 1;
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {

			ans[i] = max;
			temp += a[ind2] - a[ind1];
			if (temp > max) {
				max = temp;
				freq[max]++;
			} else
				freq[temp]++;
			sum[ind3] = temp;

			freq[sum[index]]--;
			if (freq[max] == 0) {
				int find = max;
				while (find >= 0 && freq[find] == 0)
					find--;
				max = find;
			}
			index--;
			ind1--;
			ind2--;
			ind3--;

		}
		int count = 0;
		for (int i = 0; i < p; i++) {
			if (str.charAt(i) == '!')
				count++;
			else
				System.out.println(ans[count % n]);
		}

	}

}