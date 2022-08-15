package ProgrammingPractices;

import java.util.*;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap m = new LinkedHashMap();
		m.put("Himal", 200);
		m.put("Mukesh", 100);
		m.put("Ramesh", 300);
		m.put("Gayatri", 400);
		m.put("Subham", 500);
		System.out.println(m);
		
		Set s = m.keySet();
		System.out.println(s);
		
		Collection c = m.values();
		System.out.println(c);
		
		Set s1 = m.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while( itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"--------"+ m1.getValue());
			if(m1.getKey().equals("Himal"))
			{
				m1.setValue("Fuchhi");
			}
		}
		System.out.println(m);
	}

}
