package com.chap05.sec06;

public class LoginDemo01 {
	public static void main(String args[]){
		if(args.length!=2){
			System.out.println("����ĸ�ʽ����ȷ������������");
			System.out.println("��ʽ��JavaDemo01 �û���  ����");
			System.exit(1);
		}
		String name = args[0];
		String password = args[1];
		if(name.equals("lxh") && password.equals("mldn")){
			System.out.println("��ӭ"+name+"����");
		}else
		{
			System.out.println("������û�������������");
		}
	}

}
