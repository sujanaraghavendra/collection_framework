package arraylist;

import java.util.ArrayList;

public class all {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println(a1);
		
		ArrayList a2=new ArrayList<>();
		a1.add(50);
		a1.add(60);
		a2.addAll(a1);
		System.out.println(a2);
		
		System.out.println(a2.size());
		System.out.println(a2.containsAll(a1));
		System.out.println(a1.contains(a2));
		// TODO Auto-generated method stub

	}

}
