package com.program;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

	public static void main(String[] args) {

		String s = "long short longest";
		String s1[] = s.split(" ");
		String longest = "";

		for (String str : s1) {

			if (str.length() > longest.length()) {

				longest = str;

			}

		}

		System.out.println("Longest substring is: " + longest);

		char ch[] = longest.toCharArray();

		Map<Character, Integer> mp = new HashMap<>();

		for (char c : ch) {

			if (mp.containsKey(c)) {

				int count = mp.get(c);

				mp.put(c, count + 1);

			} else

				mp.put(c, 1);

		}

		System.out.println(mp);

	}

}
