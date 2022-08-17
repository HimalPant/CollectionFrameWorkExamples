package ProgrammingPractices;
import java.util.*;
public class CollectionsSearchDemo1 {
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
		System.out.println(l);
		Collections.sort(l, new MyComparatorBinarySearch());
		System.out.println("Elements After Sorting::" + l);
		System.out.println(Collections.binarySearch(l, "Himal", new MyComparatorBinarySearch()));
		System.out.println(Collections.binarySearch(l, 4, new MyComparatorBinarySearch()));
		System.out.println(Collections.binarySearch(l, "Mukesh", new MyComparatorBinarySearch()));
	}

}
class MyComparatorBinarySearch implements Comparator{

	
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}
	
}
