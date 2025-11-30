package com.program;

public class StringCtoS {

	public static void main(String[] args) {

		String s = "CAPITALsmall";
		StringBuffer sb = new StringBuffer(s);

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (Character.isLowerCase(ch)) {

				sb.setCharAt(i, Character.toUpperCase(ch));

			}
			if (Character.isUpperCase(ch)) {

				sb.setCharAt(i, Character.toLowerCase(ch));

			}

		}

		System.out.println(sb);

	}
}
