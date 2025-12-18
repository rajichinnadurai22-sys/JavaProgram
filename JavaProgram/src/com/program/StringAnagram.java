package com.program;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {

		String a = "slient";
		String b = "listen";

		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();

		Arrays.sort(ac);
		Arrays.sort(bc);

		if (Arrays.equals(ac, bc)) {

			System.out.println("String Anagram " + a + " are " + b);

		} else

			System.out.println("Not anagram");

	}
}
