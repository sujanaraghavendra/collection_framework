package vector;

import java.util.Stack;

public class stack {

	public static void main(String[] args) 
	{
		Stack s1=new Stack<>();
		System.out.println(s1.isEmpty());
		s1.add(10);
		s1.push(20);
		s1.push(true);
		s1.push(10);
		s1.push("hello");
		System.out.println(s1);
		System.out.println(s1.pop());
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1);
		while(!s1.isEmpty())
		{
			System.out.println(s1.pop());
		}
		
		
		// TODO Auto-generated method stub

	}

}
