package com.chap05.sec03;

public class StringDemo01 {
	public static void main(String args[]){
    String str1 = "hello";                //ֱ�Ӹ�ֵ
    String str2 = new String("hello");    //ͨ��new ʵ��������ֵ
    String str3 = str2;                   //���ô���
    System.out.println("str1==str2 ==>  " + (str1==str2));
    System.out.println("str1==str3==>   " +(str1==str3));
    System.out.println("str1==str3==>   " +(str2==str3));
	}
}
