package com.spring.example6di1ci1;

public class Employee {
	private int empno;
	private String department;

	public Employee() {
		System.out.println("Employee default Constructor");
	}

	public Employee(int empno) {
		this.empno = empno;
	}

	public Employee(String department) {
		this.department = department;
	}

	public Employee(int empno, String department) {
		this.empno = empno;
		this.department = department;
	}

	public void displayInfo() {
		System.out.println("Employee Number : " + empno + "\t Department : " + department);
	}
}
