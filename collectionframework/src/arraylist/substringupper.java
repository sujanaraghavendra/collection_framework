package arraylist;

import java.util.ArrayList;

public class substringupper {

	public static void main(String[] args)
	{
		ArrayList <String> a1=new ArrayList<>();
		a1.add("pritham");
		a1.add("asit");
		a1.add("subhash  ");
		System.out.println(a1);
		for(int i=0;i<a1.size();i++)
		{
			a1.set(i, a1.get(i).substring(0,1).toUpperCase()+a1.get(i).substring(1));
		}
		System.out.println(a1);
		// TODO Auto-generated method stub

	}

}
