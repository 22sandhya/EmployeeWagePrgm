package com.bz.emp;

import java.util.Random;

public class EmpWagePrograms {

	public static void main(String[] args) {

		System.out.println("welcome to emloyee wage computation program");
		int IS_FULL_TIME = 1;
		Random random = new Random();
		int empCheck = random.nextInt(3);
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}

}
