package com.chap05.sec06;
class Person7{
	private String name;
	private int  age;
	private static String country = "成都";   //定义一个static属性
	public static void setCountry(String c){
		country = c;
	}
	public String getCountry(){
		return country;
	}
	Person7(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
	public void info(){
    System.out.println("姓名:"+this.getName()+" , 年龄："+this.getAge()+" , 城市："+this.getCountry());
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
}
public class StaticDemo03 {
	public static void main(String args[]){
		Person7 per1 = new Person7("张三",33);    //实例化对象
		Person7 per2 = new Person7("李明",38);    //实例化对象
		Person7 per3 = new Person7("小王",35);    //实例化对象
		per1.info();
		per2.info();
		per3.info();
		System.out.println("上面是修改static变量之前，下面是修改static变量之后");
		Person7.setCountry("上海");        //使用类名调用static方法
		per1.info();
		per2.info();
		per3.info();
	}

}


