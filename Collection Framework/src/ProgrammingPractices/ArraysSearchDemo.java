package ProgrammingPractices;

import java.util.*;

public class ArraysSearchDemo {
	public static void main(String[] args) {
		int[] a = { 9, 1, 8, 2, 10, 3, 22, 11, 66, 12 };
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 1));
		System.out.println(Arrays.binarySearch(a, 44));

		String[] s = { "Prateek", "Himal", "Saurav", "Sunil", "Bikash", "Gordon", "Gokul" };
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "Sunil"));
		System.out.println(Arrays.binarySearch(s, "Kailash"));

		Arrays.sort(s, new MyComparator5());
		System.out.println(Arrays.binarySearch(s, "Himal", new MyComparator5()));
		System.out.println(Arrays.binarySearch(s, "Bikash",new  MyComparator5()));
		System.out.println(Arrays.binarySearch(s, "Kailash"));
	}

}

class MyComparator5 implements Comparator {

	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}

}
