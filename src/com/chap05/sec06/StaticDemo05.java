 package com.chap05.sec06;
   class Demo1{
	   private String name;           //��������
	   private static int count = 0;   //���ж����������
	   public Demo1(){
		   count++;                    //ֻҪ�ж�������������Ծ�����
		   this.name = "Demo-"+count;   //�����Զ���������
	   }
	   public String getName(){
		   return this.name;
	   }
	   public Demo1(String name){          //ֱ�Ӷ�������
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
