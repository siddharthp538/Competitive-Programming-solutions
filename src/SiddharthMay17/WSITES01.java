package SiddharthMay17;
// Problem from CodeChef's May Long Challenge 2017
// Problem No: 5
// Link to the problem: https://www.codechef.com/MAY17/problems/WSITES01
// author: siddharthp538
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class WSITES01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> unblocked = new ArrayList<>();
		ArrayList<String> blocked = new ArrayList<>();
		int n = s.nextInt(), count = 0;
		WSITES01 solver = new WSITES01();
		solver.answer(s, unblocked, blocked, n, count);

	}

	void answer(Scanner s, ArrayList<String> unblocked, ArrayList<String> blocked, int n, int count) {
		for (int i = 0; i < n; i++) {
			char c = s.next().charAt(0);
			String str = s.next();
			if (c == '+') {
				unblocked.add(str);

			} else {
				blocked.add(str);
				count++;
			}
		}
		Collections.sort(unblocked);
		HashMap<Character, Integer> index = new HashMap<>();
		for (int i = 0; i < n - count; i++) {
			if (!index.containsKey(unblocked.get(i).charAt(0))) {
				index.put(unblocked.get(i).charAt(0), i);
			}
		}
		boolean ok = true;
		HashMap<String, String> map = new HashMap<>();
		ArrayList<String> ans = new ArrayList<>();
		for (int i = 0; i < blocked.size(); i++) {
			if (index.containsKey(blocked.get(i).charAt(0))) {
				String temp = getans(unblocked, blocked.get(i), index.get(blocked.get(i).charAt(0)));
				if (temp.equals("-1")) {
					ok = false;
					break;
				}
				if (!map.containsKey(temp)) {
					ans.add(temp);
					map.put(temp, temp);
				}

			} else {
				String temp1 = Character.toString(blocked.get(i).charAt(0));
				if (!map.containsKey(temp1)) {
					ans.add(temp1);
					map.put(temp1, temp1);
				}

			}
		}
		if (!ok)
			System.out.println(-1);
		else {
			Collections.sort(ans);
			System.out.println(ans.size());
			for (int i = 0; i < ans.size(); i++) {
				System.out.println(ans.get(i));
			}
		}
	}

	public static String getans(ArrayList<String> unblocked, String str, int index) {
		char k = str.charAt(0);
		int len = str.length();
		StringBuilder ans = new StringBuilder();
		for (int i = index; i < unblocked.size() && k == unblocked.get(i).charAt(0); i++) {
			int j;
			StringBuilder sb = new StringBuilder();
			int check = unblocked.get(i).length();
			for (j = 0; j < len; j++) {
				if (j == check) {
					sb.append(str.charAt(j));
					break;
				}
				if (str.charAt(j) == unblocked.get(i).charAt(j))
					sb.append(str.charAt(j));
				else {
					sb.append(str.charAt(j));
					break;
				}
			}
			if (sb.length() > ans.length()) {
				ans = new StringBuilder(sb);
			}
			if (j == len)
				return "-1";
		}

		return ans.toString();
	}

}
