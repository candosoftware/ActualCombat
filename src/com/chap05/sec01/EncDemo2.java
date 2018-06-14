package com.chap05.sec01;
class Person1{
	private  String name;
	private  int  age;
	public void tell(){
		System.out.println("我的姓名是： " + getName()+" 我的年龄是 "+getAge());
	}
	public void setName(String a){
		name = a;
	}
	public String getName(){
		return name;
	}
	public void setAge(int n){
		if(n>0 && n<150)
		{
		age = n;
		}
	}
	public int getAge(){
		return age;
	}
}
public class EncDemo2 {
	public static void main(String args[]){
		Person1 per1 = new Person1();
		per1.setName("terry");
		per1.setAge(110);
		per1.tell();
	}

}
