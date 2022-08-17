package ProgrammingPractices;

import java.util.TreeMap;
 
public class NavigableMapDemo {
	public static void main(String[] args) {
		TreeMap<String, String> m = new TreeMap<>();
		m.put("b", "Banana");
		m.put("c", "Cat");
		m.put("a", "Apple");
		m.put("d", "Dog");
		m.put("g", "Gun");
		System.out.println(m);
		System.out.println(m.ceilingKey("c"));
		System.out.println(m.floorKey("e"));
		System.out.println(m.lowerKey("e"));
		System.out.println(m.higherKey("e"));
		System.out.println(m.pollFirstEntry());
		System.out.println(m.pollLastEntry());
		System.out.println(m);
		
	}

}
