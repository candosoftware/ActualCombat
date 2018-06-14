package com.chap06.sec7;
class A{
	public void fun1(){
		System.out.println("A---public void fun1(){}");
	}
	public void fun2(){
		this.fun1();
	}
};
class B extends A{      //对象B继承父类A
	public void fun1(){
		System.out.println("B--->public void fun1(){}");
	}
	public void fun3(){
		System.out.println("b--->public void fun3(){}");
	}
	
};

public class PolDemo01 {
   public static void main(String args[]){
	  B b = new B();  //实例化子类对象b 
	  A a = b;   //发生了向上转型的关系，子类--->父类
	  a.fun1();  //调用了子类中被覆写的方法fun1
   }
}
