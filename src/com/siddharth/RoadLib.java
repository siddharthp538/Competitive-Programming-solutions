package com.siddharth;
/*
import java.util.ArrayList;
import java.util.Scanner;

public class RoadLib {
	
	public static void main(String[] args) {

		
		
		
		Scanner s = new Scanner(System.in);
		long q = s.nextLong();
		while (q-- > 0) {
			int nodes = s.nextInt(), edges = s.nextInt(), lib = s.nextInt(), road = s.nextInt();
			ArrayList<Integer> a = new ArrayList<>();
			ArrayList<Integer> b = new ArrayList<>();


			
			
			a.add(s.nextInt());
				b.add(s.nextInt());
			}

			int ans = nodes * lib;
			if (lib < road) {
				System.out.println(ans);
				return;
			}

			for (int i = 0; i < nodes; i++) {
				boolean visit[] = new boolean[nodes + 1];
				int temp = lib;
				for (int j = i; j < nodes; j++) {
					visit[a.get(i)] = true;
					visit[b.get(i)] = true;
					temp += road;

				}
				temp = cal(visit, lib);
				ans = Math.min(temp, ans);

			}
			System.out.println(ans);
			System.out.println();

		}

	}

	public static int cal(boolean[] temp, int lib) {
		int ans = 0;
		for (int i = 0; i < temp.length; i++) {
			if (!temp[i])
				ans += lib;
		}

		return ans;
	}

}*/