package com.program;

public class SecondLongestSubString {

	public static void main(String[] args) {
		
		String s = "long short longest tiny";
		String s1[] = s.split(" ");

		String longest = "";
		String secondLongest = "";

		for (String str : s1) {

			if (str.length() > longest.length()) {
				secondLongest = longest; // move old longest to second
				longest = str; // update new longest
			} else if (str.length() > secondLongest.length() && !str.equals(longest)) {
				secondLongest = str;
			}
		}

		System.out.println("Longest word: " + longest);
		System.out.println("Second longest word: " + secondLongest);
	}
}
