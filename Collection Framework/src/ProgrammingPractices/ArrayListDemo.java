package ProgrammingPractices;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");
		l.add(null);
		l.add(null);
		l.add(10);
		l.add("Hello");
		l.add(null);
		System.out.println(l);
		l.remove(1);
		l.set(2, "Himal");
		System.out.println(l);
	}

}
