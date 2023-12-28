package linked;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add("hello");
		System.out.println(l1);
		l1.addFirst(100);
		l1.add(20);
		l1.add("Hello");
		
		System.out.println(l1);
		l1.addLast(200);
		l1.addFirst("Hi");
		System.out.println(l1);
		System.out.println(l1.getLast());
		System.out.println(l1.getFirst());
		
		// TODO Auto-generated method stub

	}

}
