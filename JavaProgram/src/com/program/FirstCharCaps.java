package com.program;

public class FirstCharCaps {

	public static void main(String[] args) {

		String s = "time to rule";
		String s1[] = s.split(" ");

		StringBuffer sb = new StringBuffer();

		for (String str : s1) {

			sb.append(Character.toUpperCase(str.charAt(0))).append(str.substring(1) + " ");

		}

		System.out.println(sb);

	}
}
