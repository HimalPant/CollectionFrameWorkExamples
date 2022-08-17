package ProgrammingPractices;

import java.util.*;

public class CollectionsSortDemo1 {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("K");
		l.add("G");
		l.add("Y");
		l.add("H");
		l.add("D");
		l.add("E");
		l.add("L");
		System.out.println("Before Sorting: " + l);
		Collections.sort(l,new MyComparatorSort());
		System.out.println("After Sorting: " + l);
	}

}

class MyComparatorSort implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		return s2.compareTo(s1);
	}
}
