package arraylist;

import java.util.ArrayList;

public class arraylist1 {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList<
				>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		 
		
		for(int i=0;i<a1.size();i++)
		{
			for(int j=i;j<a1.size();j++) {
				for(int k=i;k<=j;k++)
				{
					System.out.print(a1.get(k)+" ");
				}
				System.out.println();
			}
		}
		// TODO Auto-generated method stub

	}

}
