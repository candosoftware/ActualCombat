package com.chap05.sec06;
class Person2{
	private int age;     //定义age属性
	Person2(int age){     // 构造函数传入参数
		this.setAge(age);    //为属性赋值
	}
	public boolean compare(Person2 p){
		return this.getAge() == p.getAge();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class ThisDemo03 {
   public static void main(String args[]){
	   Person2 per1 = new Person2(12);
	   Person2 per2 = new Person2(13);
	   boolean flag = per1.compare(per2);
	   System.out.println(flag);
	   System.out.println("per1.age = "+per1.getAge());
	   System.out.println("per2.age = "+per2.getAge());
	   
   }
}
