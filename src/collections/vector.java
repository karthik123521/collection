package collections;

import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		Vector v=new Vector(9,2);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		v.add(80);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(50);
		v.add(60);
		v.add(70);
		v.add(80);
		v.addElement(100);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
	}

}
