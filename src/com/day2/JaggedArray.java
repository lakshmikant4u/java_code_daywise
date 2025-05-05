package com.day2;

public class JaggedArray {
	public static void main(String[] args) {
		// Declaration and initialization of a jagged array
		int[][] jagged = new int[3][];
		int[] a1 = { 1, 2 };
		int[] a2 = new int[] { 1, 2 };
		jagged[0] = a1;// {1, 2};
		jagged[1] = a2;// new int[] { 3, 4, 5 };
		jagged[2] = new int[] { 6, 7, 8, 9 };

		// Printing the jagged array
		System.out.println("Jagged Array:");
		for (int i = 0; i < jagged.length; i++) {
			for (int j = 0; j < jagged[i].length; j++) {
				System.out.print(jagged[i][j] + " ");
			}
			System.out.println();
		}
	}
}
