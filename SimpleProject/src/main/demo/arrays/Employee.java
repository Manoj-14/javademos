package main.demo.arrays;

public class Employee {
	int id;
	String name;
	double salary;
	transient String aadharNo; //transient -> dont't serialize

	public Employee(int id, String name, double salary, String aadharNo) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.aadharNo = aadharNo;
	}

	public String toString() {
		return this.id + "|" + this.name + "|" + this.salary + "|" + this.aadharNo;
	}
}
