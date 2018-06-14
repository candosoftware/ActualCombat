package com.chap06.sec01;
class Person11{
	private String name;
	private int age;
	public Person11(){
		System.out.println("父类Person中的构造方法");
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
		System.out.println("子类Student的构造方法");
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
		stu.setSchool("北京大学");
		System.out.println("学校名字是： "+stu.getSchool());
		stu.setName("马云");
		System.out.println("名字是： "+stu.getName());
		
	}

}
