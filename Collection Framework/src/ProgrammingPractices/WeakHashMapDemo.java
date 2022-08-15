package ProgrammingPractices;

import java.util.*;

/* In the case of HashMap even if the object is not associated with any variable it is not eligible for garbage collection
 * i.e Garbage Collector is dominated by HashMap object.
 * but in case of WeakHashMap if the object is not associated with any variable it is eligible for garbage collection i.e 
 * Garbage Collector dominates WeakHashMap Object
 */
public class WeakHashMapDemo {
	public static void main(String[] args) throws Exception {
		WeakHashMap m = new WeakHashMap();
		//HashMap m = new HashMap();
		Temp t = new Temp();
		m.put(t, "Durga");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(m);

	}

}

class Temp {
	public String toString() {
		return "temp";
	}

	public void fianlize() {
		System.out.println("Finalize method is called");
	}
}