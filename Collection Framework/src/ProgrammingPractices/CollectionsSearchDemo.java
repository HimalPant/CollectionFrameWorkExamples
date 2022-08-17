package ProgrammingPractices;
import java.util.*;
public class CollectionsSearchDemo {
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
		Collections.sort(l);
		System.out.println("Elements After Sorting: " + l);
		System.out.println(Collections.binarySearch(l, "Himal"));
		System.out.println(Collections.binarySearch(l, "Pawan"));
	}

}
