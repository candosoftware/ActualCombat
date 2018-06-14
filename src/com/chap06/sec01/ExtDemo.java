package com.chap06.sec01;
class Person10{
	private String name;
	private  int age;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
}

class Student{
	private String name;
	private int age;
	private String school;
	public void setName(String name){
		this.name =name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setSchool(String school){
		this.school = school;
	}
	public String getSchool(){
		return school;
	}
	
}

public class ExtDemo{
	public static void main(String args[]){
	   Person10 per = new Person10();
	   Student stu = new Student();
	   per.setName("乐乐");
	   stu.setName("小雷");
	   System.out.println("姓名是：  "+per.getName());
	   System.out.println("Student类的姓名是： "+stu.getName());
	}

}
