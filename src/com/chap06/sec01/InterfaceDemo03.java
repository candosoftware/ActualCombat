package com.chap06.sec01;
interface AAA{                    //定义接口AAA
	public String AUTHOR = "李兴华";//定义全局常量AUTHOR
	public void print();          //定义抽象方法
	public String getinfo();      //定义抽象方法
}
abstract class BBB{               //定义抽象类BBB
	public abstract void say();   //抽象方法
}
class XXX extends BBB implements AAA{  //定义类XXX 继承抽象类BBB 继承接口AAA

	@Override
	public void print() {                   //覆写接口中的方法
		// TODO Auto-generated method stub
		System.out.println("作者:"+AUTHOR);
	}

	@Override
	public String getinfo() {             //覆写接口中的方法
		// TODO Auto-generated method stub
		return "Hello";
	}

	@Override
	public void say() {                      //覆写抽象类BBB中的方法
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}
	
}

public class InterfaceDemo03 {
	public static void main(String args[]){
		XXX x = new XXX();                 //实例化子类对象
		System.out.println(x.getinfo());   //调用覆写后的方法
		x.say();                           //调用覆写后的方法
		x.print();                         //调用覆写后的方法
	}

}
