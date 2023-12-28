package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class lhs {

	public static void main(String[] args)
	
	{
		LinkedHashSet l=new LinkedHashSet<>();
		l.add(10);
		l.add(20);
		l.add(true);
		l.add(20.5);
		l.add(39.7);
		l.add("hello");
		System.out.println(l);
		Iterator i=l.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		// TODO Auto-generated method stub

	}

}
