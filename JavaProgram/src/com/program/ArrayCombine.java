package com.program;

import java.util.Arrays;

public class ArrayCombine {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };
		int b[] = { 4, 5, 6 };
		int c[] = new int[a.length + b.length];
		int join = 0;

		for (int i = 0; i < a.length; i++) {

			c[join++] = a[i];

		}

		for (int j = 0; j < b.length; j++) {

			c[join++] = b[j];

		}

		System.out.println(Arrays.toString(c));

	}
}
