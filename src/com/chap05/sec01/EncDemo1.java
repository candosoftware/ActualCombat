package com.chap05.sec01;
class Person{
	private String name;     //��������������
	private  int age;         //������������Ժ�����
	public void tell(){       //ȡ����Ϣ�ķ���
		System.out.println("�����ǣ� " + getAge() + "  ������    " + getName());
	}
	public String getName(){           //ȡ������
		return name;
	}
	public void setName(String n){
		name = n;                   //��������
	}
	public int getAge(){            //ȡ������
		return age;
	}
	public void setAge(int a){
		if(a>=0 && a<=150){
		age = a;                 //��������
		}
	}
} 

public class EncDemo1 {
	public static void main(String args[]){
		Person per = new Person();
		per.setName("����");
		per.setAge(120);
		per.tell();
		
	}

}
