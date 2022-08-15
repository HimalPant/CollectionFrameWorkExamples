package ProgrammingPractices;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("Ramesh Pant");
		l.add("Prakash Pant");
		l.add("Mukesh Pant");
		l.add(null);
		l.add(10);
		l.add(10%6);
		l.addFirst("Himal Pant");
		System.out.println(l);
		l.removeFirst();
		l.addLast("Rajendra Prasad Pant");
		System.out.println(l);
		l.getLast();
		System.out.println(l);
		
				
	}

}
