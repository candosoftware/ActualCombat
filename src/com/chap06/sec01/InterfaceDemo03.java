package com.chap06.sec01;
interface AAA{                    //����ӿ�AAA
	public String AUTHOR = "���˻�";//����ȫ�ֳ���AUTHOR
	public void print();          //������󷽷�
	public String getinfo();      //������󷽷�
}
abstract class BBB{               //���������BBB
	public abstract void say();   //���󷽷�
}
class XXX extends BBB implements AAA{  //������XXX �̳г�����BBB �̳нӿ�AAA

	@Override
	public void print() {                   //��д�ӿ��еķ���
		// TODO Auto-generated method stub
		System.out.println("����:"+AUTHOR);
	}

	@Override
	public String getinfo() {             //��д�ӿ��еķ���
		// TODO Auto-generated method stub
		return "Hello";
	}

	@Override
	public void say() {                      //��д������BBB�еķ���
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}
	
}

public class InterfaceDemo03 {
	public static void main(String args[]){
		XXX x = new XXX();                 //ʵ�����������
		System.out.println(x.getinfo());   //���ø�д��ķ���
		x.say();                           //���ø�д��ķ���
		x.print();                         //���ø�д��ķ���
	}

}
