package com.chap05.sec01;
class Student{
	private String stu_no;
	private String stu_name;
	private float  math;
	private float  englis;
	private float  computer;
	Student(String stu_no,String stu_name,float math,float english,float computer){
		   this.set_stu_no(stu_no);
		   this.set_stu_name(stu_name);
		   this.set_math(math);
		   this.set_english(english);
		   this.set_computer(computer);
	      }                                 //带5个参数的构造函数，用来传递参数的值
	public float max(){                                //求最大值的函数
		 float max =math;
		 max = max>computer ? max:computer;
		 max=max>englis ? max:englis;
		 return max;
	      } 
	public float min(){                                //求最小值的函数
		float min =  math;
		min = min<computer ? min:computer;
		min = min<englis ? min:englis;
		return min;
	      }
	public float average(){                             //求平均值的函数
		float average = (math+englis+computer)/3;
		return average;
	      }
	public float total(){                                //求总分的函数
		float total;
		total = math+englis+computer;
		return total;
	       }
	public void set_stu_no(String n){
		stu_no = n;
		}
	public void set_stu_name(String na){
		stu_name = na;
	}
	public void set_math(float m){
		math = m;
	}
	public void set_english(float e){
		englis = e;
	}
	public void set_computer(float c){
		computer = c;
	}
	public String get_stu_no(){
		return stu_no;
		
	}
	public String get_stu_name(){
		return stu_name;
	}
	public float get_math(){
		return math;
	}
	public float get_english(){
		return englis;
	}
	public float get_computer(){
	   return computer;
	}
	
		
	}
public class EncDemo4 {
	public static void main(String args[]){
		Student Stu = new Student("9527","李兴华",88,92,100);
		System.out.println("学生的编号是：  "+ Stu.get_stu_no());
		System.out.println("学生的姓名是：   "+ Stu.get_stu_name());
		System.out.println("最好的成绩是：   "+ Stu.max());
		System.out.println("最差的成绩是：   "+ Stu.min());
		System.out.println("平均成绩是：   "+ Stu.average());
		
	}

}
