package com.program;

public class StringReversePosition {

	public static void main(String[] args) {

		String str = "continue move";
		String[] str1 = str.split(" ");
		String rev = "";

		for (int i = 0; i < str1.length; i++) {

			for (int j = str1[i].length() - 1; j >= 0; j--) {

				System.out.print( str1[i].charAt(j));

			}
			//System.out.println(rev + " ");
			System.out.print(" ");

		}
		//

	}
}
