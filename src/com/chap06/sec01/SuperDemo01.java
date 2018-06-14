package com.chap06.sec01;
class Person12{
	private String name;
	private int age;
	public Person12(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
	public void setName(String name){     //设置姓名
		this.name = name;
	}
	public String getName(){              //取得姓名
		return name;
	}
	public void setAge(int age){          //设置年龄
		this.age = age;
	}
	public int getAge(){                  //取得年龄
		return age; 
	}
	public String getInfo(){
		return "姓名：  "+this.getName()+"  年龄:    "+this.getAge();
	}
};
   class Student12 extends Person12{       //定义一个子类继承父类，扩展父类的功能
    private String school;
    public Student12(String name,int age,String school){     //子类的构造方法，有三个参数
    	super(name,age);             //调用父类中有两个参数的构造方法
    	this.setSchool(school);      //调用子类的方法赋值
    }
	   public void  setSchool(String school){      //设置子类的属性schoo
		   this.school = school;
	   }
	   public String getSchool(){                  //取得子类的属性school
		   return school;
	   }
	   public String getInfo(){   //覆写父类的方法，扩大相关功能
		  // return super.getInfo()+"   学校：  "+this.getSchool();
		  // return "   学校：  "+this.getSchool();
		  return "姓名: "+super.getName();
	   }
	   
   };
public class SuperDemo01 {
	public static void main(String args[]){
		Student12 stu12 = new Student12("雷军", 48, "武汉大学"); //实例化子类的实例
		System.out.println(stu12.getInfo());     //调用子类的方法，打印输出
	}

}
