package com.chap05.sec01;

class person3{
	private String  name;     //������������
	private int age ;         //������������
	public void tell(){       //ȡ����Ϣ�ķ���
		System.out.println("�����ǣ�  "+getName3()+"�����ǣ� "+getAge3());
	}
	person3(String name,int age){      //���幹�췽��Ϊ���Ը�ֵ
		this.setName3(name);           //Ϊname���Ը�ֵ
		this.setAge3(age);             //Ϊage���Ը�ֵ
	}
	public void setName3(String n){     //��������
		name = n; 
	}
	public String getName3(){           //ȡ������
		return name;
	}
	public void setAge3(int a){         //��������
		if(a>0 && a<150)
		{
		age = a;
		}
	}
	public int getAge3(){        //ȡ������
		return age;
	}
}

public class EncDemo3 {
	public  static void main(String args[]){        //����������
		person3 per3 = new person3("����",38);       //���ù��췽����������������
		per3.tell();                                //�����Ϣ
	}

}
