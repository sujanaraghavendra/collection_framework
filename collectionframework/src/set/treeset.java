package set;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args)
	{
		TreeSet t=new TreeSet<>();
		t.add(10);
		t.add(3);
		t.add(2);
		t.add(1);
		t.add(1);
		t.add(5);
		t.add(7);
		System.out.println(t);
		System.out.println("printing the element in ascending order");
		Iterator i1=t.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("printing the element in descending order");
		Iterator i=t.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
