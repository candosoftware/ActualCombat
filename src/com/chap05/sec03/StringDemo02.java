package com.chap05.sec03;

public class StringDemo02 {
   public static void main(String args[]){
	   String str1 = "hello";                 // 定义字符串
	   char c[] = str1.toCharArray();         //将字符串转换成字符数组
	   for(int i=0;i<str1.length();i++){      //循环输出
		   System.out.print(c[i] + "\t");
	   }
	   System.out.println("");
		   String str2 = new String(c);       //将全部数组变为String
		   System.out.println(str2);
		   String str3 = new String(c,0,3);    //将部分数组变为String
		   System.out.println(str3);
	 
   }
}
