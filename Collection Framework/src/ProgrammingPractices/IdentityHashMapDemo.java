package ProgrammingPractices;

import java.util.*;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		IdentityHashMap m = new IdentityHashMap();
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		m.put(I1, "Himal");
		m.put(I2, "Saurav");
		System.out.println(m);
	}
}
//   In the case of IdentityHashMap JVM will use == operator to identify the duplicate.
//	Since == operator is meant for Address comparison or reference comparison 
//	so in this case the output will be like {10=Himal, 10=Saurav}


