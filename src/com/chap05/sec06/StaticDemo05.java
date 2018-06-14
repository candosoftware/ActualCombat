 package com.chap05.sec06;
   class Demo1{
	   private String name;           //保存名字
	   private static int count = 0;   //所有对象共享改属性
	   public Demo1(){
		   count++;                    //只要有对象产生，改属性就自增
		   this.name = "Demo-"+count;   //进行自动编名操作
	   }
	   public String getName(){
		   return this.name;
	   }
	   public Demo1(String name){          //直接定义名字
		   this.name = name;
	   }
	      }
public class StaticDemo05 {
	public static void main(String args[]){
	   System.out.println(new Demo1().getName());
	   System.out.println(new Demo1("LXH").getName());
	   System.out.println(new Demo1());
	   System.out.println(new Demo1("MLDN").getName());
	   
	}

}
