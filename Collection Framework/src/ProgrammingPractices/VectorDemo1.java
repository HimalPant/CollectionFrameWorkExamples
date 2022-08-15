package ProgrammingPractices;

import java.util.Vector;

public class VectorDemo1 {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());
		for(int i=0; i<=10; i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		v.addElement(null);
		System.out.println(v.capacity());
		System.out.println(v);
		System.out.println(v.elementAt(11));
	}

}
