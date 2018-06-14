package com.chap06.sec01;
interface AA{                      //定义了一个接口AA
	public String AUTHON ="李兴华";   
	public void print();
	public String getInfo();
};
interface BB{                  //定义了一个接口BB
	public void say();
};
class X implements AA,BB{      //类X继承了接口AA和BB    

	//private static final String Hello = null;

	@Override
	public void say() {                     //覆写接口BB里的方法
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}

	@Override
	public void print() {                     //覆写接口AA里的方法
		// TODO Auto-generated method stub
		System.out.println("作者：  " + AUTHON);
	}

	@Override
	public String getInfo() {                //覆写接口里的方法
		// TODO Auto-generated method stub
		return "Hello";
	}
	
};
public class InterfaceDemo02 {
	public static void main(String args[]){
	   X x = new X();         //实例化对象x
	   x.say();               //调用被覆写过的方法
	   x.getInfo();           //调用被覆写过的方法
	   x.print();            //调用被覆写过的方法
	}

}
