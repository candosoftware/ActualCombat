package com.chap05.sec06;
   class demo{
	  private static int count = 0;   //����һ��static ���ԣ����ж����������
	   public demo(){
		   count++;                    //ֻҪ�ж��������������
		   System.out.println("������"+count+"��ʵ��");
	   }
   }
public class StaticDemo04 {
   public static void main(String args[]){
	   new demo();         //��������
	   new demo();         //��������
	   new demo();         //��������
	 //  demo dm =new demo();
	 //  System.out.println(dm.count);
   }
}
