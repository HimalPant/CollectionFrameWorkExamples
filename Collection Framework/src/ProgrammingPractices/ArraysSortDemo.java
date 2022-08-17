package ProgrammingPractices;

import java.util.*;

public class ArraysSortDemo {
	public static void main(String[] args) {
		int a[] = { 2, 1, 5, 3, 9 };
		System.out.println("Primitive Arrays Before Sorting:");
		for (int a1 : a) {
			System.out.println(a1);
		}

		Arrays.sort(a);
		System.out.println("Primitive Arrays After Sorting:");
		for (int a1 : a) {
			System.out.println(a1);
		}

		String[] s = { "A", "Z", "B", "X" };
		System.out.println("Object Type Array Before Sorting:");
		for (String s1 : s) {
			System.out.println(s1);
		}

		Arrays.sort(s);
		System.out.println("Object Type Array After Sorting:");
		for (String s1 : s) {
			System.out.println(s1);
		}

		Arrays.sort(s, new MyComparatorArraysSorting());
		System.out.println("Object Type Array After Sorting By Using Comparator:");
		for (String s2 : s) {
			System.out.println(s2);
		}
	}

}

class MyComparatorArraysSorting implements Comparator {
	public int compare(Object o1, Object o2) {
		String a1 = o1.toString();
		String a2 = o2.toString();
		return a2.compareTo(a1);
	}

}
