package com.chap05.sec04;
class Demo{
	int temp = 30;
}
public class PassByDemo01 {
	public static void main(String args[]){
		Demo d1 = new Demo();
		d1.temp = 50;
		System.out.println("fun方法调用之前：" + d1.temp);
		fun(d1);
		System.out.println("fun方法调用之后：" + d1.temp);
	}
	public static void fun(Demo d2){                 //此处的方法由主方法调用
		d2.temp = 1000;
	}

}
