package com.mile1.bean;

public class Student {

	private String name;
	private int []marks;
	private String grade;
	
	public Student() {
		super();
	}

	public Student(String name, int []marks) {
		super();
		this.name = name;
		this.marks = marks;
		//this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int marks[]) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Sttudent [name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	
	
	
}
