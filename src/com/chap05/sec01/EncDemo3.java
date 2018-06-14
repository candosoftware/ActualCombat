package com.chap05.sec01;

class person3{
	private String  name;     //声明姓名属性
	private int age ;         //声明年龄属性
	public void tell(){       //取得信息的方法
		System.out.println("姓名是：  "+getName3()+"年龄是： "+getAge3());
	}
	person3(String name,int age){      //定义构造方法为属性赋值
		this.setName3(name);           //为name属性赋值
		this.setAge3(age);             //为age属性赋值
	}
	public void setName3(String n){     //设置姓名
		name = n; 
	}
	public String getName3(){           //取得姓名
		return name;
	}
	public void setAge3(int a){         //设置年龄
		if(a>0 && a<150)
		{
		age = a;
		}
	}
	public int getAge3(){        //取得年龄
		return age;
	}
}

public class EncDemo3 {
	public  static void main(String args[]){        //定义主函数
		person3 per3 = new person3("老王",38);       //调用构造方法，传递两个参数
		per3.tell();                                //输出信息
	}

}
