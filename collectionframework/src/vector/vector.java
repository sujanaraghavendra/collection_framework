package vector;

import java.util.ListIterator;
import java.util.Vector;

public class vector {

	public static void main(String[] args)
	{
		Vector v1=new Vector<>();
		v1.add(10);
		v1.addElement(20);
		v1.add(10);
		v1.add(50);
		v1.add("hello");
		v1.add(true);
		System.out.println(v1);
		v1.removeElement(50);
		System.out.println(v1);
		for(Object o:v1)
		{
			System.out.println(o);
		}
		System.out.println("==================");
		ListIterator i=v1.listIterator(v1.size());
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
 	
		
		// TODO Auto-generated method stub

	}

}
