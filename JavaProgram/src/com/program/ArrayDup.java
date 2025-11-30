package com.program;

import java.util.*;

public class ArrayDup {

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, 1, 2 };

		Set<Integer> set = new HashSet();

		for (int s : ar) {

			set.add(s);
		}

		System.out.println(set);

		//---------------------------//
		
		int[] input = { 0, 1, 2, 3, 3, 4, 4, 5, 5, 6, 5, 2, 8 };
		int[] temp = new int[input.length];
		int j = 0;
		Arrays.sort(input);
		int newLength = 1;
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] != input[i + 1]) {
				temp[j] = input[i];
				j++;
				newLength++;
			}
		}
		temp[j] = input[input.length - 1];
		int[] output = Arrays.copyOf(temp, newLength);
		System.out.println(Arrays.toString(output));

	}

}
