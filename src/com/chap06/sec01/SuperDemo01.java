package com.chap06.sec01;
class Person12{
	private String name;
	private int age;
	public Person12(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
	public void setName(String name){     //��������
		this.name = name;
	}
	public String getName(){              //ȡ������
		return name;
	}
	public void setAge(int age){          //��������
		this.age = age;
	}
	public int getAge(){                  //ȡ������
		return age; 
	}
	public String getInfo(){
		return "������  "+this.getName()+"  ����:    "+this.getAge();
	}
};
   class Student12 extends Person12{       //����һ������̳и��࣬��չ����Ĺ���
    private String school;
    public Student12(String name,int age,String school){     //����Ĺ��췽��������������
    	super(name,age);             //���ø����������������Ĺ��췽��
    	this.setSchool(school);      //��������ķ�����ֵ
    }
	   public void  setSchool(String school){      //�������������schoo
		   this.school = school;
	   }
	   public String getSchool(){                  //ȡ�����������school
		   return school;
	   }
	   public String getInfo(){   //��д����ķ�����������ع���
		  // return super.getInfo()+"   ѧУ��  "+this.getSchool();
		  // return "   ѧУ��  "+this.getSchool();
		  return "����: "+super.getName();
	   }
	   
   };
public class SuperDemo01 {
	public static void main(String args[]){
		Student12 stu12 = new Student12("�׾�", 48, "�人��ѧ"); //ʵ���������ʵ��
		System.out.println(stu12.getInfo());     //��������ķ�������ӡ���
	}

}
