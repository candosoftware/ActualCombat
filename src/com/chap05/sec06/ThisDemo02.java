package com.chap05.sec06;
class Person1{
	private String name;
	private     int age;
	public Person1(String name,int age){       //ͨ�����췽��Ϊ���Ը�ֵ
		this.setName(name);                  //����name����
		this.setAge(age);                    //����age����
			}
	public boolean compare(Person1 per){
		//���ô˷���ʱ�����������������һ���ǵ�ǰ����һ���Ǵ���Ķ���
		Person1 p1 = this;    //��ʾ��ǰ���÷����Ķ���Ϊp1
		Person1 p2 = per;     //��ʾ����Ķ���Ϊp2
		if(p1==p2){          //�Ƚ���������ĵ�ַ�������ַһ�����϶����
			return true;
		}
		//�ֱ��ж�ÿһ�������Ƿ����
		if(p1.name.equals(p2.name) && p1.age == p2.age){
			return true;
		}else
		{
			return false;
		}
	}
	public String  getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;		
	}
};
public class ThisDemo02 {
	public static void maim(String args[]){
		Person1 per1 = new Person1("����",33);
		Person1 per2 = new Person1("����",33);
		if(per1.compare(per2)){
			System.out.println("�����������");
		}else
		{
			System.out.println("�����������");	
		}
	}

}
