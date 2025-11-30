package com.program;

import java.util.*;

public class Array8thLargest {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 4, 3, 6, 7, 3, 8, 9, 23, 54, 21, 57, 87, 44, 32 };
		int k = 8; // means 8th largest number
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				if (a[i] == a[j]) {
					j++;
				}
			}
		}
		System.out.println(Arrays.toString(a));

		System.out.println(a[a.length - (k)]);

	}
}
