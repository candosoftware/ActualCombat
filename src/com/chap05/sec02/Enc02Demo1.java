 package com.chap05.sec02;
class Student{
	private String stu_no;
	private String stu_name;
	private float   math;
	private float   english;
	private float   computer;  
	Student(String stu_no,String stu_name,float math,float english,float computer){
		this.setStu_no(stu_no);
		this.setStu_name(stu_name);
	    this.setMath(math);
	    this.setEnglish(computer);
	    this.setComputer(computer);
	}
	public void setStu_no(String n){
		stu_no = n;
	}
	public void setStu_name(String a){
		stu_name = a;
	}
	public void setMath(float m){
		math =m;
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
	public float average(){
		float average;
		average = (math+english+computer)/3;
		return average;
	}
	public float max(){
		float max;
		max = math;
		max = max >english ? max:english;
		max = max >computer ? max:computer;
		return max;
	}
	public float min(){
		float min;
		min = math;
		min = min<english ? min:english;
		min = min<computer ? min:computer;
		return min;
	}
}
public class Enc02Demo1 {
	public static void main(String args[]){
		Student stu = new Student("9528","李明",99,88,79);
		System.out.println("学生的编号是： "+stu.getStu_no());
		System.out.println("学生的姓名是：  "+stu.getStu_name());
		System.out.println("最好的成绩是："+stu.max());
		System.out.println("最差的成绩是： "+stu.min());
		System.out.println("三科平均成绩是："+stu.average());
	}

}
