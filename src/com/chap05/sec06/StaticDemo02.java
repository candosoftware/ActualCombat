package com.chap05.sec06;
class Person5{
	private String  name;
	private int age;
	static String country = "重庆";
	Person5(String name,int age){
		this.setName(name);
		this.setAge(age);
	}	
	public void info(){
		System.out.println("姓名:"+this.getName()+" , 年龄："+this.getAge()+" , 城市："+Person5.country);
	}
	public void setName(String name){
		this.name = name;
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
}   

public class StaticDemo02 {
	public static void main(String args[]){
Person5 per1 = new Person5("张三",33);
Person5 per2 = new Person5("李明",38);
Person5 per3 = new Person5("小王",35);
per1.info();
per2.info();
per3.info();
System.out.println("城市属性改变之后");
Person5.country = "北京";
per1.info();
per2.info();
per3.info();
	}
}
