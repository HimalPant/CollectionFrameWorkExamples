package ProgrammingPractices;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(30);
		t.add(34);
		t.add(21);
		t.add(0);
		t.add(2);
		t.add(5);
		System.out.println(t);
	}
// This is the program to insert Integer object in TreeSet Where sorting order is descending
}

class MyComparator implements Comparator {
	public int compare(Object o1, Object o2) {

		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
//		return i1.compareTo(i2);   Ascending Order 
//		return -i1.compareTo(i2);  Descending Order
//		return i2.compareTo(i1);   Descending Order
//		return -i2.compareTo(i1);  Ascending Order
//		return +1;  Insertion Order
//		return -1;  Reverse Of Insertion Order
//		return 0;   Only first element will be inserted and all other elements are considered as duplicates.
		if (i1 < i2) {
			return +1;
		} else if (i1 > i2) {
			return -2;
		} else {
			return 0;
		}
		
	}
}
