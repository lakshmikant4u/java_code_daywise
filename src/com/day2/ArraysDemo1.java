package com.day2;

import java.util.Arrays;

public class ArraysDemo1 {
	public static void main(String[] args) {
		int[] marks = new int[5]; // Declaration and memory allocation
		marks[0] = 90;
		marks[1] = 80;
		System.out.println(Arrays.toString(marks));
		// or use initialization
		int[] scores = { 85, 90, 75, 95, 88 };
		System.out.println(Arrays.toString(scores));

	}
}
