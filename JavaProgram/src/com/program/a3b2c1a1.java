package com.program;

public class a3b2c1a1 {

	public static void main(String[] args) {

		String s = "aaabbccabc";
		StringBuilder result = new StringBuilder();
		int count = 1;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			// compare current char with next char
			if (i < s.length() - 1 && ch == s.charAt(i + 1)) {
				count++;
			}
			// when character changes
			else {
				result.append(ch).append(count);
				count = 1;
			}
		}

		System.out.println(result);
	}

}
