package com.chap05.sec03;

public class StringDemo01 {
	public static void main(String args[]){
    String str1 = "hello";                //直接赋值
    String str2 = new String("hello");    //通过new 实例化对象赋值
    String str3 = str2;                   //引用传递
    System.out.println("str1==str2 ==>  " + (str1==str2));
    System.out.println("str1==str3==>   " +(str1==str3));
    System.out.println("str1==str3==>   " +(str2==str3));
	}
}
