package com.chap05.sec03;

public class StringDemo02 {
   public static void main(String args[]){
	   String str1 = "hello";                 // �����ַ���
	   char c[] = str1.toCharArray();         //���ַ���ת�����ַ�����
	   for(int i=0;i<str1.length();i++){      //ѭ�����
		   System.out.print(c[i] + "\t");
	   }
	   System.out.println("");
		   String str2 = new String(c);       //��ȫ�������ΪString
		   System.out.println(str2);
		   String str3 = new String(c,0,3);    //�����������ΪString
		   System.out.println(str3);
	 
   }
}
