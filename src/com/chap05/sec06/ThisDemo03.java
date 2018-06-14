package com.chap05.sec06;
class Person2{
	private int age;     //����age����
	Person2(int age){     // ���캯���������
		this.setAge(age);    //Ϊ���Ը�ֵ
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
