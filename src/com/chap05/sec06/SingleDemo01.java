package com.chap05.sec06;
   class Singleton{
	   //在内部产生本类的实例化对象，将属性封装
	   private static  Singleton instance = new Singleton();
	   private Singleton(){                //将构造方法封装
		   
	   }
	   public static Singleton getInstance(){  //通过静态方法，取得Singleton实例
		   return instance;
	   }
	   public void print(){
		   System.out.println("Hello World");
	   }
   }
public class SingleDemo01 {
	public static void mian(String args[]){
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		s1.print();
		s2.print();
		s3.print();
	}

}
