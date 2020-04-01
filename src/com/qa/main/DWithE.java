package com.qa.main;

import exceptions.BIsGreaterThanAException;

public class DWithE {

	int a = 0;
	int b = 0;

	public int add(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int times(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) throws BIsGreaterThanAException {
		if (b > a) {
			throw new BIsGreaterThanAException();
		}
		return a / b;
	}

}
