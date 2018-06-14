package com.chap05.sec06;
   class demo{
	  private static int count = 0;   //定义一个static 属性，所有对象共享此属性
	   public demo(){
		   count++;                    //只要有对象产生，就自增
		   System.out.println("产生了"+count+"个实例");
	   }
   }
public class StaticDemo04 {
   public static void main(String args[]){
	   new demo();         //新增对象
	   new demo();         //新增对象
	   new demo();         //新增对象
	 //  demo dm =new demo();
	 //  System.out.println(dm.count);
   }
}
