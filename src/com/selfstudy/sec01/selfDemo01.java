package com.selfstudy.sec01;
public class selfDemo01 {
   private String name;
   private int age;
   public selfDemo01(){
	  name = "΢ѧԷ";
	  age = 3;
   }
   public static void main(String args[]){
	   selfDemo01  obj = new selfDemo01();
	   System.out.println("�����ǣ�" +obj.name+","+"�����ǣ�"+obj.age);
   }
}
/*
��������˳���ǣ�
�����е��� 9 �У����ǳ������ڡ�
Ȼ�����е��� 10 �У�����Ҫ new һ��Demo����Ҫ���� Demo �Ĺ��췽����
�����е��� 5 �У�ע�⣺���ܺܶ��˾��ý�������Ӧ�����е� 6 ���ˣ�����ʼ��һ���࣬�����ȳ�ʼ���������ԡ�
������е��� 2 �У�Ȼ���ǵ� 3 �С�
���Գ�ʼ������󣬲Żص����췽����ִ������Ĵ��룬Ҳ���ǵ� 6 �С��� 7 �С�
Ȼ���ǵ�8�У���ʾ new һ��Demoʵ����ɡ�
Ȼ��ص� main ������ִ�е� 11 �С�
Ȼ���ǵ� 12 �У�main����ִ����ϡ�
*/