package com.chap06.sec01;

abstract class A{                         //������һ��������A
	public  final String Flag = "CHINA";  //����һ��final���� Flag����ֵ
	private String name   ;         //����һ��private name���� 
	public String getName(){              //ȡ������
		return name;
	}
	public void setName(String name){     //��������
		this.name = name;
	}
	public abstract void print();      //����һ��������print������ʵ�����Բ���Ҫ{}������
};
class B extends A{                     //����һ����B �̳���A

	@Override
	public void print() {              //�����и�дA���еĳ��󷽷�print
		
		// TODO Auto-generated method stub
		System.out.println("FLAG = "+super.Flag);       //���Flag
		System.out.println("�����ǣ�  " +super.getName());  //�������
	}
   
   	
};
public class AbstratcDemo01 {
	public static void main(String args[]){
		B b = new B();                        //ʵ��������b
		b.setName("����");                     //���ø���ķ�������������
		b.print();                            //���ñ����и�д�ķ���print
	}

}
