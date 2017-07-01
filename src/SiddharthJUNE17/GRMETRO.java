package SiddharthJUNE17;
/*
//HackerRank's GridLand Metro Problem.
import java.util.*;

public class GRMETRO {
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		Scanner s = new Scanner(System.in);
		HashMap<Integer, ArrayList<Pair>> map = new HashMap<>();
		HashMap<Integer, Integer> val = new HashMap<>();
		long n = s.nextLong(), m = s.nextLong(), k = s.nextLong();
		ArrayList<Integer> values = new ArrayList<>();
		while (k-- > 0) {
			int r = s.nextInt(), c1 = s.nextInt(), c2 = s.nextInt();
			if (!val.containsKey(r)) {
				values.add(r);
				val.put(r, r);
			}
			if (!map.containsKey(r)) {
				ArrayList<Pair> a = new ArrayList<>();
				a.add(new Pair(c1, c2));
				map.put(r, a);
			} else {

				map.get(r).add(new Pair(c1, c2));
			}
		}
		long ans = 0;
		for (int i = 0; i < val.size(); i++) {
			ArrayList<Pair> ar = map.get(values.get(i));
			Collections.sort(ar, new left());
			int x1 = ar.get(0).x, x2 = ar.get(0).y;
			for (int j = 1; j < ar.size(); j++) {
				int y1 = ar.get(j).x, y2 = ar.get(j).y;
				if ((x1 <= y2 && y1 <= x2)) {
					if (x1 >= y1)
						x1 = y1;
					if (y2 >= x2)
						x2 = y2;
				} else {
					ans += x2 - x1 + 1;
					x1 = y1;
					x2 = y2;
				}
			}
			ans += x2 - x1 + 1;
		}
		System.out.println((n * m) - ans);
	}
}

class left implements Comparator<Pair> {
	@Override
	public int compare(Pair arg0, Pair arg1) {
		if (arg0.x <= arg1.x) {
			return -1;
		} else {
			return 1;
		}
	}
}

class Pair {
	int x, y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

}*/
