package com.chap05.sec06;
class Person1{
	private String name;
	private     int age;
	public Person1(String name,int age){       //通过构造方法为属性赋值
		this.setName(name);                  //设置name属性
		this.setAge(age);                    //设置age属性
			}
	public boolean compare(Person1 per){
		//调用此方法时，里面存在两个对象，一个是当前对象，一个是传入的对象
		Person1 p1 = this;    //表示当前调用方法的对象，为p1
		Person1 p2 = per;     //表示传入的对象，为p2
		if(p1==p2){          //比较两个对象的地址，如果地址一样，肯定相等
			return true;
		}
		//分别判断每一个属性是否相等
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
		Person1 per1 = new Person1("李明",33);
		Person1 per2 = new Person1("李明",33);
		if(per1.compare(per2)){
			System.out.println("两个对象相等");
		}else
		{
			System.out.println("两个对象不相等");	
		}
	}

}
