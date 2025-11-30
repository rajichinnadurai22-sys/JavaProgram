package com.program;

import java.util.*;

public class StringOccurance {

	public static void main(String[] args) {

		String s = "welcome";
		char ch[] = s.toCharArray();

		Map<Character, Integer> mp = new TreeMap<>();

		for (char c : ch) {

			if (mp.containsKey(c)) {
				int count = mp.get(c);
				mp.put(c, count + 1);

			} else
				mp.put(c, 1);
		}
		Map<Character, Integer> map = new TreeMap<>();

		int max = Collections.max(mp.values());
		int min = Collections.min(mp.values());

		for (char c : ch) {

			if (mp.get(c) == min) {

				map.put(c, mp.get(c));

			}

		}

		System.out.println(mp);
		System.out.println(map);
	}

}
