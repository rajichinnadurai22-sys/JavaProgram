package com.program;

import java.util.Arrays;
import java.util.Comparator;

public class StreamString {

	public static void main(String[] args) {

		String s = "rat tiger elephant";

		// Find longest word using streams
		String longest = Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse("");

		// Count 'n'
		long nCount = longest.chars().filter(c -> c == 'n').count();

		// Count 't'
		long tCount = longest.chars().filter(c -> c == 't').count();

		System.out.println("Longest word: " + longest);
		System.out.println("n -> " + nCount);
		System.out.println("t -> " + tCount);

	}

}
