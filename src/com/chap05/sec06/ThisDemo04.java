package com.chap05.sec06;
class Person4{
	private String name;
	private int age;
	String country = "重庆";
	Person4(String name,int age){
		this.setAge(age);
		this.setName(name);
	}
	public void info(){
	System.out.println("姓名："+this.getName()+"    年龄："+this.getAge()+", 城市："+this.country);
	       }
	public void setAge(int age){
		this.age = age;
			}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
};
public class ThisDemo04 {
   public static void main(String args[]){
	   Person4 per1 = new Person4("李明",33);
	   Person4 per2 = new Person4("小王",38);
	   Person4 per3 = new Person4("小龙",35);
	   per1.info();
	   per2.info();
	   per3.info();
   }
}
