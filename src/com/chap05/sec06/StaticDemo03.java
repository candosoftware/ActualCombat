package com.chap05.sec06;
class Person7{
	private String name;
	private int  age;
	private static String country = "�ɶ�";   //����һ��static����
	public static void setCountry(String c){
		country = c;
	}
	public String getCountry(){
		return country;
	}
	Person7(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
	public void info(){
    System.out.println("����:"+this.getName()+" , ���䣺"+this.getAge()+" , ���У�"+this.getCountry());
	}
	public String getName(){
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
}
public class StaticDemo03 {
	public static void main(String args[]){
		Person7 per1 = new Person7("����",33);    //ʵ��������
		Person7 per2 = new Person7("����",38);    //ʵ��������
		Person7 per3 = new Person7("С��",35);    //ʵ��������
		per1.info();
		per2.info();
		per3.info();
		System.out.println("�������޸�static����֮ǰ���������޸�static����֮��");
		Person7.setCountry("�Ϻ�");        //ʹ����������static����
		per1.info();
		per2.info();
		per3.info();
	}

}


