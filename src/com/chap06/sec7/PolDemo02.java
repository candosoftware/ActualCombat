package com.chap06.sec7;
class AA{
	public void fun1(){
		System.out.println("A---public void fun1(){}");
	}
	public void fun2(){
		this.fun1();
	}
};
class BB extends AA{      //����B�̳и���A
	public void fun1(){
		System.out.println("B--->public void fun1(){}");
	}
	public void fun3(){
		System.out.println("b--->public void fun3(){}");
	}
	
};

public class PolDemo02 {  
   public static void main(String args[]){
	  
	  AA aa = new BB();   //����������ת�ͣ� ����--->����
	  BB bb = (BB)aa;  //����������ת��            ����--->���� 
	  bb.fun1();  //�����������б���д�ķ���fun1
	  bb.fun2();
	  bb.fun3();
   }
};
