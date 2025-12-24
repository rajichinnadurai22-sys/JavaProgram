package com.program;

public class CountofCharacter {

	public static void main(String[] args) {

		String s = "welcomel";
		int slen = s.length();
		int newlen = s.replace("l", "").length();

		int count = slen - newlen;

		System.out.println("Occurance of l " + count);

	}

}
