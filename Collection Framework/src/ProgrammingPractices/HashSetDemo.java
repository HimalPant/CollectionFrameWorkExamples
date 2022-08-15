package ProgrammingPractices;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("Himal");
		h.add("Saurav");
		h.add(11);
		h.add(null);
		h.add(10);
		h.add(null);
		h.add("Sunil");
		h.add("Prateek");
		System.out.println(h.add("Himal")); // If there found duplicate object in the HashSet then it will simply
											// returns false.
		System.out.println(h);
		// You see output the insertion order of the object is not preserved
	}

}
