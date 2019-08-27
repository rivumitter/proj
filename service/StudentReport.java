package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

	public String FindGrades(Student student)
	{
		String grade = "Grade is"+" ";
		int val = this.cal(student);
		if(val<35)
		{
			student.setGrade("F");
			grade+=student.getGrade();
		}
		else if(val>35 && val<150)
		{
			student.setGrade("C");
			grade+=student.getGrade();
		}
		else if(val>=150 && val<200)
		{
			student.setGrade("B");
			grade+=student.getGrade();
		}
		else if(val>=200 && val<250)
		{
			student.setGrade("A");
			grade+=student.getGrade();
		}
		else
		{
			student.setGrade("A+");
			grade+=student.getGrade();
		}
		return grade;
	}
	
	public String validate(Student student) throws NullNameException, NullStudentObjectException, 
													NullMarksArrayException
	{
		if(student==null)
			throw new NullStudentObjectException();
		
		if(student.getName()==null)
			throw new NullNameException();
		if(student.getMarks()==null)
			throw new NullMarksArrayException();
		
		else 
			return "Valid";
		
	}
	public int countNullMarksArray(Student s[])
	{
		int c = 0;
		
		
			for(int i=0;i<s.length;i++)
			{
				try {
				if(s[i]==null || s[i].getMarks().length==0)
					c++;
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		return c;
	}
	
	public int findNumberOfNullName(Student s[])
	{
		
		int c = 0;
			
			//System.out.println("here");
			for(int i=0;i<s.length;i++)
			{
				if(s[i]==null)
					continue;
				if(s[i].getName()==null)
					c++;
			}
		return c;
	
	}
	int cal(Student student)
	{
		int []marks = student.getMarks();
		int c = 0;
		for(int i=0;i<marks.length;i++)
			c+=marks[i];
		return c;
	}
	
	
	
	
	
	
	
}
