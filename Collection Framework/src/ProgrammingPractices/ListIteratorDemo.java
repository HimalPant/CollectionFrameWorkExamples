package ProgrammingPractices;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Himal");
		l.add("Mukesh");
		l.add("Ramesh");
		l.add("Subham");
		System.out.println(l);
		ListIterator ltr = l.listIterator();
		while (ltr.hasNext()) {
			String s = (String) ltr.next();
			if (s.equals("Himal")) {
				ltr.remove();
			} else if (s.equals("Subham")) {
				ltr.add("Rajendra");
			} else if (s.equals("Ramesh")) {
				ltr.set("Krishna");
			}
		}
		System.out.println(l);

	}

}
