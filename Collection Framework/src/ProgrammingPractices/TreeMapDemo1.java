package ProgrammingPractices;
import java.util.*;
public class TreeMapDemo1 {
	public static void main(String[] args) {
		TreeMap m = new TreeMap(new MyComparator());
		m.put(1, "Himal Pant");
		m.put(10, "Rajendra Pant");
		m.put(13, "Krishna Pant");
		m.put(16, "Mukesh Pant");
		m.put(12, "Ramesh Pant");
		m.put(11, "Bhuwan Pant");
		m.put(19, "Subham Pant");
	//	m.put(null, 1000);
	//	m.put(200, 5000);
		System.out.println(m);
	}

}
class MyComparator implements Comparator{
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);    //Customised sorting order i.e Ascending order
	}
}
