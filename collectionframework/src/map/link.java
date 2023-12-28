package map;

import java.util.LinkedHashMap;

public class link {

	public static void main(String[] args) 
	{
		LinkedHashMap h=new LinkedHashMap();
		h.put(1,"Ravi");
		h.put(2, "Alok");
		h.put(3, "Alok");
		h.put(6,"vivek");
		h.put(5, "sourav");
		h.put(false, true);
		   
		System.out.println(h);
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.get(2));
		System.out.println(h.containsKey(2));
		
		// TODO Auto-generated method stub

	}

}
