package ProgrammingPractices;

import java.io.Serializable;
import java.util.*;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		LinkedList l1 = new LinkedList();
		System.out.println(l instanceof Serializable);
		System.out.println(l1 instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		System.out.println(l1 instanceof RandomAccess); 
		// ArrayList and vector only support RandomAccess interface so that object will be accessed with the same speed.
	}

}
