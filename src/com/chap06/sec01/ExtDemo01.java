package com.chap06.sec01;
class Person11{
	private String name;
	private int age;
	public Person11(){
		System.out.println("����Person�еĹ��췽��");
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
};
class Student1 extends Person11{
	private String school;
	public Student1(){
		System.out.println("����Student�Ĺ��췽��");
	}
	public void setSchool(String school){
		this.school = school;
	}
	public String getSchool(){
		return school;
	}
	
};

public class ExtDemo01 {
	public static void main(String args[]){
		Student1 stu = new Student1();
		stu.setSchool("������ѧ");
		System.out.println("ѧУ�����ǣ� "+stu.getSchool());
		stu.setName("����");
		System.out.println("�����ǣ� "+stu.getName());
		
	}

}
