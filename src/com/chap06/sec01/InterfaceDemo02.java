package com.chap06.sec01;
interface AA{                      //������һ���ӿ�AA
	public String AUTHON ="���˻�";   
	public void print();
	public String getInfo();
};
interface BB{                  //������һ���ӿ�BB
	public void say();
};
class X implements AA,BB{      //��X�̳��˽ӿ�AA��BB    

	//private static final String Hello = null;

	@Override
	public void say() {                     //��д�ӿ�BB��ķ���
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}

	@Override
	public void print() {                     //��д�ӿ�AA��ķ���
		// TODO Auto-generated method stub
		System.out.println("���ߣ�  " + AUTHON);
	}

	@Override
	public String getInfo() {                //��д�ӿ���ķ���
		// TODO Auto-generated method stub
		return "Hello";
	}
	
};
public class InterfaceDemo02 {
	public static void main(String args[]){
	   X x = new X();         //ʵ��������x
	   x.say();               //���ñ���д���ķ���
	   x.getInfo();           //���ñ���д���ķ���
	   x.print();            //���ñ���д���ķ���
	}

}
