package com.chap05.sec06;

// import java.util.Scanner;

class Check{
	public boolean validate(String name,String password){      //����һ���������͵ķ���������������
		if(name.equals("lxh") && password.equals("mldn")){    //ִ�о������֤����
			return true;                                   //������֤��������ز�ͬ��ֵ
		}else
		{
			return false;                                   //������֤��������ز�ͬ��ֵ
		}
	}
}
class Operate{                                //������þ������֤����
   private String info[];                      //����һ��info���鷽���� ���ڽ��������ȫ������
   public Operate(String info[]){               //���췽��������Ϊinfo���飬�����յ��Ĳ���
	  this.info = info;                           //���췽��ȡ�ò���
   }
   public String login(){                           //ϵͳ��¼�ķ���
	   Check check = new Check();                   //ʵ����Check����
	   this.isExit();  
	   String name = info[0];
	   String password = info[1];
	   String str = null;
	   if (check.validate(name, password)){     //checkʵ���жϲ����ض�Ӧ��ֵ
		   str = "��ӭ"+name+"����";
	   }else{
		   str = "������û��������";
	   }
	   return str;                      //������Ϣ���û�
   }
     private void isExit() {
	// TODO Auto-generated method stub
       if(info.length!=2){
    	   System.out.println("����Ĳ�������ȷ��ϵͳ�˳���");
    	   System.out.println("��ʽ���û���������");
    	   System.exit(1);
       }
}
}

public class LoginDemo02 {
	public static void main(String args[]){
		//Scanner scan = new Scanner(System.in);
		Operate opr = new Operate(args);
		System.out.println(opr.login());
		
	}

}
