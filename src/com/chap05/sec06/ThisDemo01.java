package com.chap05.sec06;
class Person{
	private  String name;
	private int age;
	public Person(){
		System.out.println("一个新的person对象被实例化!");
	}
	public String getInfo(){
		return  "姓名:" + name +" ， 年龄："+age;
	}
	public Person(String name,int age){
		this();                       //调用无参的构造函数,必须在首行
		this.name = name;
		this.age  = age;
	}
};
public class ThisDemo01 {
   public static void main(String args[]){
	   Person per1 = new Person("李明",33);
	   System.out.println(per1.getInfo());
   }
}
