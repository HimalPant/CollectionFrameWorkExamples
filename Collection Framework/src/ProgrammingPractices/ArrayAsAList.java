package ProgrammingPractices;
import java.util.*;
public class ArrayAsAList {
	public static void main(String[] args) {
		String [] s = {"Himal","Rajendar","Nisha","Krishna","Durga","Kalawati"};
		List l = Arrays.asList(s);
		System.out.println(l);
		
		s[0]="Nishu";
		System.out.println(l);
		
		l.set(1, "Prem Lal Pant");
		System.out.println(l);
		
	/*l.add("Prajapati Pant");   
	 * By using List reference we are not allowed to replace with heterogeneous objects 
	 * otherwise we will get UnsupportedOperationException
	 * l.remove(2);   UnsupportedOperationExceptoion
	 * l.set(1, new Integer(10));   ArrayStoreException
	 */
		
	}

}
