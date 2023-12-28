package linked;

import java.util.LinkedList;
import java.util.*;
public class Student implements Comparable
{
	
	
	String sname;
	int rollno;
	double perc;
	int Class;
	
	
	public Student(String sname, int rollno, double perc, int class1) {
		super();
		this.sname = sname;
		this.rollno = rollno;
		this.perc = perc;
		Class = class1;
	}


	public String toString() {
		return "Student [sname=" + sname + ", rollno=" + rollno + ", perc=" + perc + ", Class=" + Class + "]";
	}
	public int compareTo(Object o)
	{
		Student s=(Student)o;
		if(this.perc==perc)
		{
			return 0;
			
		}
		else if (this.perc>s.perc)
		{
			return 1;
		}
		else 
		{
			return -1;
		}
		
		
	}
	public static void main(String[] args) {
		LinkedList<Student> data=new  LinkedList<>();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the details");
		System.out.println("enter the name");
		String sname=sc.nextLine();
		System.out.println("enter the rollno");
		int rollno=sc.nextInt();
		System.out.println("enter the percentage");
		double perc=sc.nextDouble();
		System.out.println("enter the  class");
	  int Class=sc.nextInt();
	  
	  data.add(new Student(sname,rollno,perc,Class));
	  boolean flag=true;
	  
	  do {
		  System.out.println("press Y to enter the details else press any key to exit");
		  char ch=sc.next().charAt(0);
		  if(ch=='Y'||ch=='y') 
		  {
			  System.out.println("enter the details");
				System.out.println("enter the name");
				sname=sc.nextLine();
				System.out.println("enter the rollno");
				rollno=sc.nextInt();
				System.out.println("enter the percentage");
				 perc=sc.nextDouble();
				System.out.println("enter the  class");
			  Class=sc.nextInt();
			  
		  }
		  else
		  {
			  flag=false;
		  }
	  }while(flag);
		System.out.println("before sort");
		System.out.println(data);
		System.out.println("after sort");
		Collections.sort(data);
		for(Student details:data)
		{
			System.out.println(details);
		}
		
		
	}
	
	
	
	

}
