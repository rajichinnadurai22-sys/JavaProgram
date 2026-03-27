package com.program;

public class ArrayUnionInsert {

	public static void main(String[] args) {

		int[] A = { 1, 2, 3 };
		int[] B = { 3, 4, 5 };

		System.out.print("A + B : ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}

		for (int i = 0; i < B.length; i++) {
			int flag = 0;
			for (int j = 0; j < A.length; j++) {
				if (B[i] == A[j]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.print(B[i] + " ");
			}
		}
		System.out.println();
		System.out.print("A X B : ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i] == B[j]) {
					System.out.print(A[i] + " ");
				}
			}
		}

		System.out.print("\nA - B : ");
		for (int i = 0; i < A.length; i++) {
			int flag = 0;
			for (int j = 0; j < B.length; j++) {
				if (A[i] == B[j]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.print(A[i] + " ");
			}
		}

		System.out.print("\nB - A : ");
		for (int i = 0; i < B.length; i++) {
			int flag = 0;
			for (int j = 0; j < A.length; j++) {
				if (B[i] == A[j]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.print(B[i] + " ");
			}
		}

	}

}