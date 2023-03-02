package main.demo.mapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		marksMap();
	}
	
	private static void marksMap() {
		Map<String, Integer> marks = new HashMap<>();
		marks.put("Mark",80);
		marks.put("Antony",95);
		marks.put("Tom",65);
		marks.put("Jerry",55);
		marks.put("Max",100);
		marks.put("Tom",35);
		
		System.out.println(marks);
		System.out.println(marks.keySet());
		System.out.println(marks.values());
		
		for ( String key : marks.keySet()) {
			System.out.println(marks.get(key));
		}

		Map<String, Integer> marks1 = new LinkedHashMap<>();
		marks1.put("Mark",80);
		marks1.put("Antony",95);
		marks1.put("Tom",65);
		marks1.put("Jerry",55);
		marks1.put("Max",100);
		marks1.put("Tom",35);
		
		System.out.println(marks1);
	}

}

