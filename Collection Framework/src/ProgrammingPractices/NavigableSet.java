package ProgrammingPractices;
import java.util.*;
public class NavigableSet {
	public static void main(String[] args) {
	TreeSet<Integer> t = new TreeSet<Integer>();
	t.add(100);
	t.add(200);
	t.add(300);
	t.add(400);
	t.add(500);
	System.out.println(t);
	System.out.println(t.ceiling(200));
	System.out.println(t.higher(500));
	System.out.println(t.floor(400));
	System.out.println(t.lower(100));
	System.out.println(t.pollFirst());
	System.out.println(t.pollLast());
	System.out.println(t);
		}
}
