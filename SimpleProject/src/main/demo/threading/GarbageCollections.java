package main.demo.threading;

import java.util.ArrayList;

public class GarbageCollections {
	
	public static void main(String[] args) {
		
		ArrayList<House> hs = new ArrayList<>();
		
		for(int i=1 ; i<10 ; i++) {
//			hs.add(new House(i));
			new House(i); // Orphan object -> it does't have any reference
		}
		System.gc(); // Requesting garbage collection to run
	}
}

class House{
	int id;
	House(int id){
		this.id = id ;
		Utils.printMsg("House created "+id);
	}
	
	protected void finalize() throws Throwable{
		Utils.printMsg("House destroyed "+id);
	}
}