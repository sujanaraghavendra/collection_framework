package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist4 {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList< >();
		a1.add(10);
		a1.add(20);
		a1.add(10);
		a1.add(true);
		a1.add('A');
		System.out.println(a1);
		  
		Iterator  i=a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		// TODO Auto-generated method stub

	}

}
