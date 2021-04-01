package com.pro;

import java.util.ArrayList;
import java.util.Collections;

public class LamdaExample {
public static void main(String args[])
{
	ArrayList<Student> list=new ArrayList<Student>();
	list.add(new Student(5,"Priya",(float) 96.5));
	list.add(new Student(10,"Anu",(float) 87.3));
	list.add(new Student(4,"Gayu",(float) 92.4));
	
	System.out.println("Sorting based on Marks:");
	
	Collections.sort(list,(a,b)->{
		return a.stuMark.compareTo(b.stuMark);
	});
	
	for(Student s:list)
	{
		System.out.println("Student Id: "+s.stuId+" "+"Student Name: "+s.stuName+" "+"Student Mark: "+s.stuMark);
	}	
	System.out.println();
	System.out.println("Sorting based on ID:");
	Collections.sort(list,(a,b)->{
		return a.stuId.compareTo(b.stuId);
	});	
	
	for(Student s:list)
	{
		System.out.println("Student Id: "+s.stuId+" "+"Student Name: "+s.stuName+" "+"Student Mark: "+s.stuMark);
	}
	
	System.out.println();
	System.out.println("Sorting based on ID:");
	Collections.sort(list,(a,b)->{
		return a.stuName.compareTo(b.stuName);
	});	

	for(Student s:list)
	{
		System.out.println("Student Id: "+s.stuId+" "+"Student Name: "+s.stuName+" "+"Student Mark: "+s.stuMark);
	}	
}
}
class Student
{
	Integer stuId;
	String stuName;
	Float stuMark;
	public Student(int stuId, String stuName, Float stuMark) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuMark = stuMark;
	}	
}
