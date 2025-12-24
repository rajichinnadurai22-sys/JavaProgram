package com.program;

import java.util.Arrays;

public class SortedString {

	public static String sortString(String str) {

		char ch[] = str.toCharArray();
		Arrays.sort(ch);

		String sorted = String.copyValueOf(ch);

		return sorted;

	}

	public static void main(String[] args) {

		System.out.println(sortString("welcome"));

	}

}
