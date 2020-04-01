package com.qa.main;

import exceptions.BIsGreaterThanAException;

public class Runner {

	public static void main(String[] args) {

		DWithE calc = new DWithE();

		System.out.println(calc.add(123, 234));
		System.out.println(calc.minus(123, 234));
		System.out.println(calc.times(123, 234));
		try {
			System.out.println(calc.divide(123, 234));
		} catch (BIsGreaterThanAException bIGTa) {
			System.out.println("number B is greater than A");
		}
	}

}
