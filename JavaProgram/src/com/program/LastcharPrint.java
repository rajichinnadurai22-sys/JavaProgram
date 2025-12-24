package com.program;

public class LastcharPrint {

	public static void main(String[] args) {

		String s = "hello world";
		String s1[] = s.split(" ");
		String result = "";

		for (String str : s1) {

			char ch = str.charAt((str.length() - 1));

			result += ch + " ";

		}

		System.out.println(result.trim());
	}
}
