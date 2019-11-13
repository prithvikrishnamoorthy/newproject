package com.demo.Vehicle.demo;

public class Calculator {

	public int addNum(int a, int b) {

		return a + b;

	}

	public int subNum(int a, int b) {

		return a - b;

	}

	public int mulNum(int a, int b) {

		return a * b;

	}

	public int divNum(int a, int b) {

		return a / b;

	}

	public int countString(String a) {
		int count = 1;

		String str;
		str = a;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
				count++;
		}

		return count;

	}

}
