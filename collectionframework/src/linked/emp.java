package linked;

import java.util.Collections;
import java.util.LinkedList;

public class emp implements Comparable{
	String ename;
	int eid;
	double salary;
	public emp(String ename, int eid, double salary) {
		
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
	}

	public String toString() {
		return "Ename:"+this.ename+" "+"Eid:"+this.eid+" "+"Salary:"+this.salary;
	}
	public int compareTo(Object o) {
		emp e=(emp)o;
		if(this.salary==e.salary) {
			return 0;
		}else if(this.salary>e.salary) {
			return 1;
		}else {
			return -1;
		}
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList<emp> data=new LinkedList<>();
		data.add(new emp("Asit",2,36000));
		data.add(new emp("Soban",1,35000));
		data.add(new emp("Aakash",3,37000));
		System.out.println(data);
		Collections.sort(data);
		System.out.println("After sorting on the basis of ascending order of salary");
		for(emp e:data) {
			System.out.println(e);
		}
		

		
	}

	}


