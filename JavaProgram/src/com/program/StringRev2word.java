package com.program;

public class StringRev2word {

	public static void main(String[] args) {

		String str = "keep moving forward always";

		String st[] = str.split(" ");

		for (int i = 0; i < st.length; i++) {

			if (i == 2) {

				for (int j = st[i].length() - 1; j >= 0; j--) {

					System.out.print(st[i].charAt(j));

				}
				System.out.print(" ");
				continue;
			}
			System.out.print(st[i] + " ");

		}

	}

}
