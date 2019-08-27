package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;

public class StudentName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student data[] = new Student[4];
		for(int i=0;i<4;i++)
			data[i] = new Student();
		
		data[0] = new Student("Sekar",new int[] {87,85,95});
		data[1] = new Student(null,new int[] {11,22,33});
		data[2] = null;
		data[3] = new Student("Manoj",null);
		
		for(int i=0;i<4;i++)
		{
			try {
				System.out.println(new StudentReport().validate(data[i]));
				System.out.println(new StudentReport().FindGrades(data[i]));
				//System.out.println(new StudentReport().findNumberOfNullName(data));
			}
			catch (NullNameException e) {
				System.out.println(e.getClass().getName());
			}
			catch (NullStudentObjectException e) {
				System.out.println(e.getClass().getName());
			} catch (NullMarksArrayException e) {
				
				System.out.println(e.getClass().getName());
			}
			catch (Exception e) {
				System.out.println(e.getClass().getName());
			}
		}
		System.out.println("Number of Null name : "+new StudentReport().findNumberOfNullName(data));
		System.out.println("Number of Null array :"+new StudentReport().countNullMarksArray(data));
		
		
		
		
	}

}
