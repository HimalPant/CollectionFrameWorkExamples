package ProgrammingPractices;

import java.util.*;

public class PriorityQueueDemo1 {
	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue(new MyComparatorForPriorityQueue());
		q.add("Himal");
		q.add("Mukesh");
		q.add("Shubham");
		q.add("Ramesh");
		q.add("Rajendra");
		q.add("Prakash");
		q.add("Bhuwan");
		q.add("Krishana");
		System.out.println(q);

	}

}

class MyComparatorForPriorityQueue implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = o2.toString();
		return -s1.compareTo(s2);
	}

}
