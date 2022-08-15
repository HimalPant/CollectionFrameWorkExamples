package ProgrammingPractices;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("Himal");
		s.push("Mukesh");
		s.push("Ramesh");
		s.push("Subham");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.search("Ramesh"));
		System.out.println(s.search("Prakash"));
		System.out.println(s.search("Rajendra Prasad Pant")); // whenever you are searching for unavailable element then it will return -1
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s);
	}

}
