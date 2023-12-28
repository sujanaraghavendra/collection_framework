package queue;

import java.util.Iterator;
import java.util.LinkedList;

public class linkqueue {

	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.offer(30.5);
		l.offer(true);
		l.add("hello");
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.peek());
		
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()); 
		}
		// TODO Auto-generated method stub

	}

}
