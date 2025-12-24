package com.program;

public class DuplicateChar {

	public static String chaDup(String s) {

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {

				char ch = s.charAt(i);

				if (s.charAt(i) == s.charAt(j)) {

					System.out.print(s.charAt(i) + " ");

				}

			}
		}
		return s;

	}

	public static void main(String[] args) {

		chaDup("automation");

	}
	// }

}
