package collections;

import java.util.List;
import java.util.Stack;

public class stack {//last in first out.
	public static void main(String[] args) {
		Stack s=new Stack();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.push(5);
		s.push(500);
		s.push(15);
		System.out.println(s);
		System.out.println(s.pop());//it removes pop element
		System.out.println(s.peek());//it shows the top element
		System.out.println(s.pop());
		System.out.println(s.search(10));
	}
}
