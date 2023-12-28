package map;

import java.util.TreeMap;

public class tree {

	public static void main(String[] args) 
	{
		TreeMap<Integer, String> h=new TreeMap<>();
		h.put(1,"Ravi");
		h.put(2, "Alok");
		h.put(3, "Alok");
		h.put(6,"vivek");
		h.put(5, "sourav");
		   
		System.out.println(h);
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.get(2));
		System.out.println(h.containsKey(2));
		
		// TODO Auto-generated method stub

	}

}
 