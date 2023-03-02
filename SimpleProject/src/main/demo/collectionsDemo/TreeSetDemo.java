package main.demo.collectionsDemo;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
//		intSet();
//		stringSet();
		
		Set<Employee> emps = new TreeSet<Employee>(new EmpNameComparator());
		emps.add(new Employee(1, "Manoj", 15000, "A0012"));
		emps.add(new Employee(2, "Abhi", 15000, "A0013"));
		emps.add(new Employee(3, "Zoya", 15000, "A0014"));
		emps.add(new Employee(4, "Shashank", 15000, "A0015"));
		
		System.out.println(emps);
	}
	
	
	private static void intSet() {
		Set<Integer> setInt = new TreeSet<Integer>() ;		
		setInt.add(5);
		setInt.add(6);
		setInt.add(1);
		setInt.add(2);
		System.out.println(setInt);
	}
	
	private static void stringSet() {
		Set<String> setInt = new TreeSet<String>() ;		
		setInt.add("Zoyaff");
		setInt.add("Ravif");
		setInt.add("Abhi");
		setInt.add("Das");
		System.out.println(setInt);
		
		
		Set<String> setInt1 = new TreeSet<String>(new StringComparator()) ;		
		setInt1.add("Zoyaff");
		setInt1.add("Ravif");
		setInt1.add("Abhi");
		setInt1.add("Dasa");
		System.out.println(setInt1);
	}
	
	
	
}

//comparable -> to provide natural ordering
//comparator -> to change natural ordering

class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		int l1 = o1.length();
		int l2 = o2.length();
		if(l1 > l2) return -1;
		else if(l1 < l2) return 1;
		else return o1.compareTo(o2);
	}
	
}

class Employee implements Comparable<Employee> {
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

	@Override
	public int compareTo(Employee o) {
		return (this.id < o.id)? -1 : 1 ;
//		return 0;
	}
}

class EmpNameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
}
