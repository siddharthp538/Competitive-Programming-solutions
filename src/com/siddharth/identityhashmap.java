package com.siddharth;

import java.util.IdentityHashMap;

public class identityhashmap {
	public static void main(String[] args) {
		IdentityHashMap<Integer, Integer> map = new IdentityHashMap<>();
		map.put(40, 1);
		map.put(40, 2);
		System.out.println(map.get(40));
	}

}
