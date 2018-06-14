package com.chap05.sec06;

public class CodeDemo01 {
	public static void main(String args[]){
		{                 //定义一个普通代码块
			int x =0;     //定义一个局部变量
			System.out.println("普通代码块--x= "+ x);
			
		}
		int x = 100;           //定义一个全局变量，与局部变量名称相同
		System.out.println("代码块之外---x= " + x);
	}

};
