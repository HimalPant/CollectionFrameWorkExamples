package ProgrammingPractices;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparatorDemo1());
		t.add(new StringBuffer("Kathmandu"));
		t.add(new StringBuffer("Pokhara"));
		t.add(new StringBuffer("Dharan"));
		t.add(new StringBuffer("Dhangadhi"));
		t.add(new StringBuffer("Mahendranagar"));
		t.add(new StringBuffer("Sudurpaschim"));
		t.add(new StringBuffer("Nepaljung"));
		t.add(new StringBuffer("Butwal"));
		System.out.println(t);
	}
// Program to insert StringBuffer Object into the TreeSet Where the elements are inserted according alphabetical order.
}

class MyComparatorDemo1 implements Comparator {

	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
		// return -s2.compareTo(s1);
	}

}
