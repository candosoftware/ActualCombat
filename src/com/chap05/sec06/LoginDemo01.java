package com.chap05.sec06;

public class LoginDemo01 {
	public static void main(String args[]){
		if(args.length!=2){
			System.out.println("输入的格式不正确，请重新输入");
			System.out.println("格式：JavaDemo01 用户名  密码");
			System.exit(1);
		}
		String name = args[0];
		String password = args[1];
		if(name.equals("lxh") && password.equals("mldn")){
			System.out.println("欢迎"+name+"光临");
		}else
		{
			System.out.println("输入的用户名，密码有误");
		}
	}

}
