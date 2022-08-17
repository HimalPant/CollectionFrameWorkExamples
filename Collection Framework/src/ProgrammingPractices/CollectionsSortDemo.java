// Demo program to sort elements of list according to default natural sorting order.
package ProgrammingPractices;

import java.util.*;

public class CollectionsSortDemo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Himal");
		l.add("Mukesh");
		l.add("Ramesh");
		l.add("Rajendra");
		l.add("Bhuwan");
		l.add("Krishna");
		System.out.println("Before Sorting: " + l);
		Collections.sort(l);
		System.out.println("After Sorting: " + l);
	}

}
