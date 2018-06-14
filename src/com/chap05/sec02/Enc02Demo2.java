package com.chap05.sec02;
class Student11{
	public String stu_no;
	private String stu_name;
	private float  math;
	private float  english;
	private float  computer;
    Student11(String stu_no,String stu_name,float math,float english,float computer){
		this.setStu_no(stu_no);
		this.setStu_name(stu_name);
		this.setMath(math);
		this.setEnglish(english);
		this.setComputer(computer);
	}
    public void setStu_no(String s){
    	stu_no = s;
    }
    public void setStu_name(String n){
    	stu_name = n;
    }
    public void setMath(float m){
    	math = m;
    }
    public void setEnglish(float e){
    	english = e;
    }
    public void setComputer(float c){
    	computer = c;
    }
    public String getStu_no(){
    	return stu_no;
    }
    public String getStu_name(){
    	return stu_name;
    }
    public float getMath(){
    	return math;
    }
    public float getEnglish(){
    	return english;
    }
    public float getComputer(){
    	return computer;
    }
    public float total(){
    	float total;
    	total = math+english+computer;
    	return total;
    }
    public float max(){
    	float max;
    	max = math>computer ? math:computer;
    	max = max>english ? max:english;
    	return max;    	
    }
    public float min(){
    	float min;
    	min = math<computer ? math:computer;
    	min = min<english ? min:english;
    	return min;
    } 
    public float average(){
    	float average;
    	average = (math+english+computer)/3;
    	return average;
    }
}

public class Enc02Demo2 {
	public static void main(String args[]){
		Student11 stu11 = new Student11("111","测试数据",90.4f,111.5f,98.8f);
		System.out.println("学号是： " + stu11.getStu_no()+"   姓名是：  "+stu11.getStu_name());
		System.out.println("平均成绩是 ： "+Math.round((stu11.average()*10)/10.00));
		System.out.println("最好的成绩是 ："+stu11.max());
		System.out.println("最差的成绩是："+stu11.min());
		System.out.println("成员变量stu_no的值是："+stu11.stu_no);
	   // System.out.println("成员变量stu_name的值是： "+stu11.stu_name);
		
	}

		}


