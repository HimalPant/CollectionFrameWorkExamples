package ProgrammingPractices;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparatorDemo());
		t.add("Himal");
		t.add("Sunil");
		t.add("Sarav");
		t.add("Raja");
		// t.add(null);
		System.out.println(t);
	}

}

// Program to insert string object into the TreeSet where all the elements should be inserted according to reverse order.
class MyComparatorDemo implements Comparator {

	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = (String) o2;
		return s2.compareTo(s1);
		// return -s1.compareTo(s2)

	}

}
