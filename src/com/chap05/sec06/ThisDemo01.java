package com.chap05.sec06;
class Person{
	private  String name;
	private int age;
	public Person(){
		System.out.println("һ���µ�person����ʵ����!");
	}
	public String getInfo(){
		return  "����:" + name +" �� ���䣺"+age;
	}
	public Person(String name,int age){
		this();                       //�����޲εĹ��캯��,����������
		this.name = name;
		this.age  = age;
	}
};
public class ThisDemo01 {
   public static void main(String args[]){
	   Person per1 = new Person("����",33);
	   System.out.println(per1.getInfo());
   }
}
