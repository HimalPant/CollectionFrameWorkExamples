package ProgrammingPractices;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		ls.add("Himal");
		ls.add("Saurav");
		ls.add("Sunil");
		ls.add("Prateek");
		ls.add(null);
		ls.add(0);
		ls.add(87);
		ls.add(10);
		System.out.println(ls);
		// You see the output the insertion order of the object is preserved
		// The slight difference between HashSet and LinkedHasSet is that in
		// HashSet insertion order is not preserved but in LinkedHasSet insertion order
		// is preserved We use LinkedHashSet to develop cache based application where
		// insertion order is preserved and duplicates are not allowed

	}

}
