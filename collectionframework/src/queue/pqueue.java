package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class pqueue {

	public static void main(String[] args) 
	{
		PriorityQueue p=new PriorityQueue<>();
		p.add(10);
		p.add(20);
		p.add(2);
		p.offer(10);
		p.offer(4);
		p.offer(49);
		System.out.println(p);
		Iterator i=p.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		while(!p.isEmpty()) {
			System.out.println(p.poll());
		}
		// TODO Auto-generated method stub

	}

}
