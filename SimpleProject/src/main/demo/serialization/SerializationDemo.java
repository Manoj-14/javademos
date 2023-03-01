package main.demo.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {
	public static void main(String[] args) {
		serilize();
		deserialize();
	}

	public static void serilize() {

		String path = "C:\\Users\\manm\\git\\javademos\\SimpleProject\\src\\emp.ser";
		//try with block -> it will automatically close the files (Only auto-closable Classes)
		try (FileOutputStream fos = new FileOutputStream(path); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			Employee emp = new Employee(5, "Manoj", 20000, "AA1501");
			oos.writeObject(emp);
			System.out.println("Serialized");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void deserialize() {
		String path = "C:\\Users\\manm\\git\\javademos\\SimpleProject\\src\\emp.ser";
		//try with block -> it will automatically close the files (Only auto-closable Classes)
		try (FileInputStream fos = new FileInputStream(path); ObjectInputStream oos = new ObjectInputStream(fos);) {
			
			Employee emp = (Employee) oos.readObject();
			System.out.println("Deserialized Object ->  "+emp);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class Employee implements Serializable {
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