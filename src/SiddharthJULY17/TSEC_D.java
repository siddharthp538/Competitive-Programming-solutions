package SiddharthJULY17;

/* Problem Name: Factory acquisition 
   Problem Code:  TSECJ03
   Contest: Tsec Codeathon
   Link: https://www.codechef.com/TSCD2017/problems/TSECJ03
   author: siddharthp538
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.InputMismatchException;

class TSEC_D {
	public static void main(String[] args) {
		InputReader s = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		int f = s.nextInt() + 1;
		int[] id = new int[f + 1];
		int i = 0;
		HashSet<Integer> set = new HashSet<>();
		id[0] = s.nextInt();
		int x = s.nextInt();
		for (i = 0; i < x; i++)
			set.add(s.nextInt());
		int max = set.size(), max_id = 0;
		i = 0;
		f--;
		while (f-- > 0) {
			id[i] = s.nextInt();
			x = s.nextInt();
			HashSet<Integer> set1 = new HashSet<>();
			set1.addAll(set);
			for (int v = 0; v < x; v++) {
				set1.add(s.nextInt());
			}
			if (set1.size() == max && id[i] < max_id)
				max_id = id[i];
			if (set1.size() > max) {
				max = set1.size();
				max_id = id[i];
			}
			i++;

		}
		System.out.println(max_id);

	}

}
