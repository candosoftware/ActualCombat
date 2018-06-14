package com.chap06.sec01;

abstract class A{                         //定义了一个抽象类A
	public  final String Flag = "CHINA";  //定义一个final属性 Flag并赋值
	private String name   ;         //定义一个private name属性 
	public String getName(){              //取得姓名
		return name;
	}
	public void setName(String name){     //设置姓名
		this.name = name;
	}
	public abstract void print();      //定义一个抽象类print，无需实现所以不需要{}大括号
};
class B extends A{                     //定义一个类B 继承类A

	@Override
	public void print() {              //子类中覆写A类中的抽象方法print
		
		// TODO Auto-generated method stub
		System.out.println("FLAG = "+super.Flag);       //输出Flag
		System.out.println("姓名是：  " +super.getName());  //输出姓名
	}
   
   	
};
public class AbstratcDemo01 {
	public static void main(String args[]){
		B b = new B();                        //实例化对象b
		b.setName("王雷");                     //调用父类的方法，设置姓名
		b.print();                            //调用本类中覆写的方法print
	}

}
