package com.chap05.sec06;
   class Singleton{
	   //���ڲ����������ʵ�������󣬽����Է�װ
	   private static  Singleton instance = new Singleton();
	   private Singleton(){                //�����췽����װ
		   
	   }
	   public static Singleton getInstance(){  //ͨ����̬������ȡ��Singletonʵ��
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
