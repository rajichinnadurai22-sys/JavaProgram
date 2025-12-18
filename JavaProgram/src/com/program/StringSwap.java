package com.program;

public class StringSwap {

	public static void main(String[] args) {

		String a = "ind";
		String b = "pak";

		System.out.println("Before swap: a = " + a + ", b = " + b);

		// Step 1: Combine both
		a = a + b; // a = "indpak"

		// Step 2: Extract b from a
		b = a.substring(0, a.length() - b.length()); // b = "ind"

		// Step 3: Extract a from a
		a = a.substring(b.length()); // a = "pak"

		System.out.println("After swap: a = " + a + ", b = " + b);

	}
}
