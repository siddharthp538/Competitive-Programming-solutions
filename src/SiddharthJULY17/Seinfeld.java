package SiddharthJULY17;

import java.util.Scanner;
import java.util.Stack;

class Seinfeld {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cases = 1;
		while (true) {
			String str = s.next();
			if (str.charAt(0) == '-')
				break;
			char[] a = str.toCharArray();
			Stack<Character> stack = new Stack<>();
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == '{')
					stack.push('{');
				else {
					if (stack.isEmpty()) {
						count++;
					} else
						stack.pop();
				}
			}

			int size = stack.size();
			if (count % 2 == 1)
				count++;
			if (size % 2 == 1)
				size++;

			System.out.print((cases++) + ". ");
			System.out.println((count / 2) + (size / 2));

		}
	}

}
