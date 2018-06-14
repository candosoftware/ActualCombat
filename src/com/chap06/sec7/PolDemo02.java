package com.chap06.sec7;
class AA{
	public void fun1(){
		System.out.println("A---public void fun1(){}");
	}
	public void fun2(){
		this.fun1();
	}
};
class BB extends AA{      //对象B继承父类A
	public void fun1(){
		System.out.println("B--->public void fun1(){}");
	}
	public void fun3(){
		System.out.println("b--->public void fun3(){}");
	}
	
};

public class PolDemo02 {  
   public static void main(String args[]){
	  
	  AA aa = new BB();   //发生了向上转型， 子类--->父类
	  BB bb = (BB)aa;  //发生了想下转型            父类--->子类 
	  bb.fun1();  //调用了子类中被覆写的方法fun1
	  bb.fun2();
	  bb.fun3();
   }
};
