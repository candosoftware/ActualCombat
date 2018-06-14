package com.chap05.sec06;

// import java.util.Scanner;

class Check{
	public boolean validate(String name,String password){      //定义一个布尔类型的方法，有两个参数
		if(name.equals("lxh") && password.equals("mldn")){    //执行具体的验证操作
			return true;                                   //根据验证情况，返回不同的值
		}else
		{
			return false;                                   //根据验证情况，返回不同的值
		}
	}
}
class Operate{                                //本类调用具体的验证操作
   private String info[];                      //定义一个info数组方法， 用于接收输入的全部参数
   public Operate(String info[]){               //构造方法，参数为info数组，即接收到的参数
	  this.info = info;                           //构造方法取得参数
   }
   public String login(){                           //系统登录的方法
	   Check check = new Check();                   //实例化Check对象
	   this.isExit();  
	   String name = info[0];
	   String password = info[1];
	   String str = null;
	   if (check.validate(name, password)){     //check实例判断并返回对应的值
		   str = "欢迎"+name+"光临";
	   }else{
		   str = "输入的用户密码错误";
	   }
	   return str;                      //返回信息给用户
   }
     private void isExit() {
	// TODO Auto-generated method stub
       if(info.length!=2){
    	   System.out.println("输入的参数不正确，系统退出！");
    	   System.out.println("格式：用户名，密码");
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
