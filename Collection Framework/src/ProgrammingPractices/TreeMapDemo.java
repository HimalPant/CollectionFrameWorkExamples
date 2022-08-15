package ProgrammingPractices;

import java.util.TreeMap;

/*Default natural sorting order by using TreeMap concept
 * In this concept the key must be homogeneous and comparable 
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap m = new TreeMap();
		m.put("Himal Pant", 101);
		m.put("Bhuwan Bhatt", 100);
		m.put("Saurav Bhatt", 102);
		m.put("Sunil Dhami", 109);
		m.put("Prateek Kunwar", 103);
		m.put("Rajendra Pant", 101);
		// m.put(105, "Shubham Pant"); ClassCastException Because key is not
		// homogeneous and comparable
		// m.put(null, 101); NullPointerExcetpion

		System.out.println(m);

	}

}
