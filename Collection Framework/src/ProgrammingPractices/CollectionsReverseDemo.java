package ProgrammingPractices;

import java.util.*;

public class CollectionsReverseDemo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Himal");
		l.add("Mukesh");
		l.add("Krishna");
		l.add("ChetRaj");
		l.add("Rajendra");
		l.add("Bhuwan");
		l.add("Ramesh");
		l.add("Prakash");
		l.add("Shubham");
		
		Collections.sort(l);
		System.out.println("Elements Before Reversing: ");
		System.out.println("                         "+l);
		
		System.out.println();
		
		Collections.reverse(l);
		System.out.println("Elements After Reversing:");
		System.out.println("                         "+l);
	}

}
