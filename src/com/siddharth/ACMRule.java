package com.siddharth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ACMRule {
	
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		HashMap<String, Integer> a = new HashMap<>();
        ArrayList<String> store = new ArrayList<>();
		int  mcount = 0;
		while (t-- > 0) {
			if (store.size() == 10)
				break;
			String sname = s.next();
			String teamname = s.next();
			if (sname.equals("MSU"))
				mcount++;
			if (!sname.equals("SCH")) {
				if (!a.containsKey(sname)) {
		            a.put(sname, 0);
					store.add(sname + " " + teamname);

				} else {
					if (sname.equals("MSU") && mcount < 5) {
						store.add("MSU" + " " + teamname);
						a.put(sname, a.get(sname) + 1);

					} else if (a.get(sname) < 1) {
						a.put(sname, a.get(sname) + 1);
						store.add(sname + " " + teamname);
					}

				}
			}
		}
		System.out.println(store.size());
		for (int i = 0; i < store.size(); i++) {
			System.out.println(store.get(i));
		}

	}

}
