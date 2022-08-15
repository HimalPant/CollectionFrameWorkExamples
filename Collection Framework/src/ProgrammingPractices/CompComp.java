package ProgrammingPractices;

import java.util.*;
import java.util.TreeSet;

public class CompComp {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		Employees e1 = new Employees("Nag", 100);
		Employees e2 = new Employees("Balaih", 200);
		Employees e3 = new Employees("Chiru", 50);
		Employees e4 = new Employees("Venki", 150);
		Employees e5 = new Employees("Nag", 100);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		
		TreeSet t1 = new TreeSet(new MyComparator1());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);

	}

}

class MyComparator1 implements Comparator {

	public int compare(Object o1, Object o2) {
		Employees e1 = (Employees) o1;
		Employees e2 = (Employees) o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}

}

class Employees implements Comparable {
	String name;
	int eid;

	public Employees(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}

	public String toString() {
		return eid + "--------" + name;
	}

	public int compareTo(Object o) {
		int eid1 = this.eid;
		Employees e = (Employees) o;
		int eid2 = e.eid;
		if (eid1 < eid2) {
			return -1;
		} else if (eid1 > eid2) {
			return +1;
		} else {
			return 0;
		}
	}
}