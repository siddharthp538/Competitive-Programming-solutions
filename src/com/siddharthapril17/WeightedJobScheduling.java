package com.siddharthapril17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class WeightedJobScheduling {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int q = s.nextInt();
			job[] jobs = new job[q];
			int index = 0;
			while (q-- > 0) {
				int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
				jobs[index++] = new job(a, a + b, c);
			}
			FinishTimeComparator comparator = new FinishTimeComparator();
			Arrays.sort(jobs, new FinishTimeComparator());
			int[] ans = new int[jobs.length];
			int len = ans.length;
			for (int i = 0; i < len; i++)
				ans[i] = jobs[i].cost;

			for (int i = 1; i < len; i++) {
				int j = 0;
				while (j != i) {
					if (jobs[j].end <= jobs[i].start)
						ans[i] = Math.max(ans[i], (ans[j] + jobs[i].cost));

					j++;

				}

			}
			int answer = Integer.MIN_VALUE;
			for (int i = 0; i < len; i++) {
				answer = Math.max(answer, ans[i]);

			}
			System.out.println(answer);

		}
		s.close();

	}

}

class job {
	int start, end, cost;

	job(int start, int end, int cost) {
		this.start = start;
		this.end = end;
		this.cost = cost;
	}
}

class FinishTimeComparator implements Comparator<job> {

	@Override
	public int compare(job arg0, job arg1) {
		if (arg0.end <= arg1.end) {
			return -1;
		} else {
			return 1;
		}
	}

}
