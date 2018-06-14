package com.chap05.sec01;
class Person{
	private String name;     //声明姓名的属性
	private  int age;         //声明年龄的属性和类型
	public void tell(){       //取得信息的方法
		System.out.println("年龄是： " + getAge() + "  姓名是    " + getName());
	}
	public String getName(){           //取得姓名
		return name;
	}
	public void setName(String n){
		name = n;                   //设置姓名
	}
	public int getAge(){            //取得年龄
		return age;
	}
	public void setAge(int a){
		if(a>=0 && a<=150){
		age = a;                 //设置年龄
		}
	}
} 

public class EncDemo1 {
	public static void main(String args[]){
		Person per = new Person();
		per.setName("丽丽");
		per.setAge(120);
		per.tell();
		
	}

}
