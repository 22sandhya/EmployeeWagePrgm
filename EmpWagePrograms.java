package com.bz.emp;

import java.util.Random;

public class EmpWagePrograms {

	public static void main(String[] args) {

		System.out.println("welcome to emloyee wage computation program");
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
	
		int empHrs = 0;
		int empWage = 0;
		Random random = new Random();
		int empCheck = random.nextInt(3);
		if (empCheck == IS_PART_TIME)
			empHrs = 4;
		else if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		// else
		// empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
		}
	}

