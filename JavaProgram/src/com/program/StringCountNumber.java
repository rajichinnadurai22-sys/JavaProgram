package com.program;

public class StringCountNumber {

	public static void main(String[] args) {

		String s = "ja33va88sele43";

		int sum = 0;
		String result = "";

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (Character.isDigit(ch)) {

				result += ch;

			} else if (!result.equals("")) {

				sum += Integer.parseInt(result);
				result = "";
			}

		}
		if (!result.equals("")) {
			sum += Integer.parseInt(result);
		}

		System.out.println(sum);

		// --------------------------------//

		String s1 = "jir32ji89re"; //reverse number

		String s2 = s1.replaceAll("[a-zA-Z]", "");
		int count = 0;

		System.out.println(s2);

		int no = Integer.parseInt(s2);

		while (no > 0) {

			count = count * 10 + no % 10;
			no = no / 10;

		}
		System.out.println(count);

	}

}
