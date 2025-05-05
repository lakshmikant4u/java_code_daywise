package com.day1;

public class DataTypes {
	public static void main(String[] args) {
		int age; // ✅ valid
		int _count; // ✅ valid
		int $salary; // ✅ valid (used in compiler-generated code)
//		int 2total;      // ❌ invalid

		int a = 10;
		long b = a; // ✅ Widening
		int c = (int) b; // ✅ Narrowing with cast

		String name = "John";
		int[] scores = { 90, 85, 78 };
		Employee emp = new Employee();

	}
}

class Employee {
}