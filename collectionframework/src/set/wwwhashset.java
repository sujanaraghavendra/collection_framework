package set;

import java.util.HashSet;
import java.util.Iterator;

public class wwwhashset {

	public static void main(String[] args) 
	{
		HashSet  h=new HashSet<>();
		h.add(10);
		h.add(20);
		h.add(true);
		h.add("hello");
		h.add(20.5);
		System.out.println(h);
		Iterator i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		// TODO Auto-generated method stub 

	}

}
 