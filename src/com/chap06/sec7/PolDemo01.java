package com.chap06.sec7;
class A{
	public void fun1(){
		System.out.println("A---public void fun1(){}");
	}
	public void fun2(){
		this.fun1();
	}
};
class B extends A{      //����B�̳и���A
	public void fun1(){
		System.out.println("B--->public void fun1(){}");
	}
	public void fun3(){
		System.out.println("b--->public void fun3(){}");
	}
	
};

public class PolDemo01 {
   public static void main(String args[]){
	  B b = new B();  //ʵ�����������b 
	  A a = b;   //����������ת�͵Ĺ�ϵ������--->����
	  a.fun1();  //�����������б���д�ķ���fun1
   }
}
