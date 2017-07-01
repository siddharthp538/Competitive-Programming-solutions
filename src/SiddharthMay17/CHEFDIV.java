package SiddharthMay17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class CHEFDIV {
	static ArrayList<Integer> prime;
	static int[] A;
	static int[] exponent;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		prime = new ArrayList<>();
		A = new int[1000001];

		for (int i = 0; i < 1000001; i++) {

			A[i] = i;
		}
		int a = s.nextInt(), b = s.nextInt();
		for (int i = a; i <= b; i++) {
			exponent = new int[41];
			int temp = i, mult = 1, max = 0;
			int index = 0;
			while (temp > 1) {
				int count = 0;
				while (temp % prime.get(index) == 0) {
					count++;
					temp /= prime.get(index);
				}
				max = Math.max(max, prime.get(index));
				mult *= (count + 1);
				exponent[prime.get(index)] = count;
				index++;

			}
			Arrays.sort(exponent);

		}

	}

	public static void sieve() {
		boolean[] mark = new boolean[1000001];
		Arrays.fill(mark, true);
		for (int i = 2; i < 1000001; i++) {
			if (mark[i]) {
				mark[i] = false;
				prime.add(i);
				for (int j = i * i; j < 1000001; j += i)
					mark[j] = false;

			}
		}
	}

}
